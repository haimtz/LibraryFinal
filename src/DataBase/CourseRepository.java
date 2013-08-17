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
	public void add(String courseName) throws Exception
	{		
		db.StoredProcdure("call add_course(?)");

		db.addParamString(1, ((String)courseName));
		db.execute();
		
		db.close();
	}

	public List<Course> getList() throws Exception
	{
		List<Course> list = new ArrayList<Course>();
		ResultSet result;
		
		db.StoredProcdure("call select_all_courses()");
		result = db.resultQuery();
		
		
		
		while(result.next())
		{
			//TODO add object to list
		}
		
		db.close();
		return list;
		
	}

}
