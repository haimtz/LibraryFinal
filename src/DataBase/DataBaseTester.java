package DataBase;

import java.util.List;

import model.Course;
import model.User;

public class DataBaseTester {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		DataBase db = new DataBase("Library_db");
		
//		db.StoredProcdure("call add_user(?,?,?,?,?,?,?)");
//		db.addParamString(1, "5678");
//		db.addParamString(2, "Haim");
//		db.addParamString(3, "Tz");
//		db.addParamString(4, "address Haim");
//		db.addParamString(5, "0000");
//		db.addParamBoolean(6, true);
//		db.addParamBoolean(7, false);
//		
//		db.execute();
//		db.close();
		
		CourseRepository rep = new CourseRepository();
		rep.add("Androied 4");
		
		List<Course> list = rep.getList();
		
		for(Course c : list)
			System.out.println(c.getName());
	}

}
