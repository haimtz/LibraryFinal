package DataBase;


import java.sql.ResultSet;
import java.util.List;

import model.*;

public class DataBaseTester {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
//		Course course = new Course();
//		course.setIdClass(1);
//		
//		Student student = new Student("1234", "DB", "TEST", "ADD GMAIL", "09888", "89", course);
//		
//		StudentRepository rpst = new StudentRepository();
//		rpst.addStudent(student);
//		
//		
//		System.out.println("Finish!!!!");
		
//		CourseRepository crp = new CourseRepository();
//		Course cu = crp.searchCourse("softwear", 2011);
//		
//		if(cu != null)
//			System.out.println("Course Name: " + cu.getCourseName() + 
//								"\nCourse year: " + cu.getYear());
//		else
//			System.out.println("No result!!!");
		
		
		Student st;
		StudentRepository studentRep = new StudentRepository();
		
		st = studentRep.serchById(1);
		
		System.out.println("id: "+ st.getIduser()
				+ " name: " + st.getUsername()
				+ " last name: " + st.getLastName());
	}

}
