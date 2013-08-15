package DataBase;


import java.sql.SQLException;
import java.util.List;

public abstract class Repository {
	
	protected DataBase db;
	
	public Repository() throws Exception
	{
		db = new DataBase("Library_db");
	}
	
	/**
	 * @param t generic
	 */
	public abstract <T> void add(T t) throws Exception;
	
	public abstract <T> List<T> getList() throws Exception;
}
