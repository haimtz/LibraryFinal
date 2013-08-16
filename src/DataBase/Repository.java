package DataBase;


import java.sql.SQLException;
import java.util.List;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public abstract class Repository {
	
	protected DataBase db;
	
	public Repository() throws Exception
	{
		db = new DataBase("Library_db");
	}
	
	/**
	 * @param t generic
	 * @return the last id
	 */
	public abstract <T> void add(T t) throws Exception;
	
	/**
	 * SELECT * FROM table
	 * @return list Of all table
	 * @throws Exception
	 */
	public abstract <T> List<T> getList() throws Exception;
}
