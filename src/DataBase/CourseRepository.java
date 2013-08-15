package DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import model.Course;

public class CourseRepository extends Repository 
{

	public CourseRepository() throws Exception {
		super();
	}

	/**
	 * @param <T>
	 * @param t course name
	 */
	@Override
	public <T> void add(T courseName) throws Exception
	{
		if(! (courseName instanceof String ))
			throw new Exception("Only String");
		
		//DataBase db = new DataBase(DATABASE_NAME);
		
		db.StoredProcdure("call add_course(?)");
		db.addParamString(1, ((String)courseName));
		db.execute();
		
		db.close();
	}

	@Override
	public <T> List<T> getList() throws Exception
	{
		List<T> list = new ArrayList<T>();
		ResultSet result;
		//DataBase db = new DataBase(DATABASE_NAME);
		
		db.StoredProcdure("call select_all_courses ()");
		result = db.resultQuery();
		
		
		
		while(result.next())
		{
			list.add((T) new Course(result.getInt("idcourse"), result.getString("courseName")));
		}
		
		db.close();
		return list;
		
	}

}
