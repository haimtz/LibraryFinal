package DataBase;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.joda.time.DateTime;


public class DataBase {
	
	private Connection connection;
	private final String JDBC_DRIVER;
	private final String DATABASE_URL;
	private final String USERNAME;
	private final String PASSWORD;
	private final String DATABASE_NAME;
	
	private PreparedStatement preper;
	
	public DataBase(String database) throws Exception
	{
		// database settings
		DATABASE_NAME = database;
		JDBC_DRIVER = "com.mysql.jdbc.Driver";
		DATABASE_URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
		USERNAME =  "root";
		PASSWORD = "1234";		
		
		// Register JDBC driver
		Class.forName(JDBC_DRIVER);
				
		// Open connection
		connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
	}
	
	public void StoredProcdure(String sql) throws SQLException
	{
		preper = connection.prepareStatement(sql);
	}
	
	public void addParamString(int index, String value) throws SQLException
	{
		preper.setString(index, value);
	}
	
	public void addParamInt(int index, int value) throws SQLException
	{
		preper.setInt(index, value);
	}
	
	public void addParamBoolean(int index, boolean value) throws SQLException
	{
		preper.setBoolean(index, value);
	}
	
	public void addParamDate(int index, DateTime value) throws SQLException
	{
		preper.setDate(index, new Date(value.toDate().getTime()));
	}
	
	public void execute() throws SQLException
	{
		preper.execute();
	}
	
	public ResultSet resultQuery() throws SQLException
	{
		ResultSet result = null;		
		result = (ResultSet) preper.executeQuery();
		
		return result;
	}
	
	public void close() throws SQLException
	{
		preper.close();
	}

}
