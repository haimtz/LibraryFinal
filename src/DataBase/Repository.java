package DataBase;

public abstract class Repository {
	
	protected DataBase db;
	
	public Repository() throws Exception
	{
		db = new DataBase("Library_db");
	}
}
