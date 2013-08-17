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
		
		db.StoredProcdure("call add_user(?,?,?,?,?,?,?)");
		db.addParamString(1, "56762284");
		db.addParamString(2, "ABC");
		db.addParamString(3, "DFR");
		db.addParamString(4, "address ABC");
		db.addParamString(5, "0000");
		db.addParamBoolean(6, true);
		db.addParamBoolean(7, false);
		
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
