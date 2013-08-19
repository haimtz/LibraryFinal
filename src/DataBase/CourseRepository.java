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
	
	public Course searchCourse(String name, int year) throws Exception
	{
		String s_year = Integer.toString(year);
		Course myCourse = null;
		
		db.StoredProcdure("call search_course(?,?)");
		
		db.addParamString(1, name);
		db.addParamString(2,s_year);
		
		ResultSet result = db.resultQuery();
		
		if( result.next())
		{
			myCourse = new Course();
			myCourse.setIdClass(result.getInt("id"));
			myCourse.setYear(result.getString("_year"));
			myCourse.setCourseName(result.getString("courseName"));
		}
		
		return myCourse;
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
