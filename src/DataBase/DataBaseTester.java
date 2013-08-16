package DataBase;


import java.sql.ResultSet;
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
		
		db.StoredProcdure("call add_user(?,?,?,?,?,?,?, ?)");
		db.addParamInt(1, 1);
		db.addParamString(2, "5676884");
		db.addParamString(3, "Haim");
		db.addParamString(4, "Tz");
		db.addParamString(5, "address Haim");
		db.addParamString(6, "0000");
		db.addParamBoolean(7, true);
		db.addParamBoolean(8, false);
		
		ResultSet result = db.resultQuery();
		
		while(result.next())
			System.out.println(result.getInt("iduser"));
		db.close();
		
//		try{
//			CourseRepository rep = new CourseRepository();
//			rep.add("Softwear");
//			
//			List<Course> list = rep.getList();
//			
//			for(Course c : list)
//				System.out.println(c.getName());
//		}
//		catch(Exception ex)
//		{
//			System.out.println("Error!!!"+ex.getMessage());
//		}
	}

}
