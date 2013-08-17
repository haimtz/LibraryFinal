package DataBase;

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
	
	/**
	 * SELECT * FROM table
	 * @return list Of all table
	 * @throws Exception
	 */
	public abstract <T> List<T> getList() throws Exception;
}
