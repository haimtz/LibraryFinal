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
		
		Course course = new Course();
		course.setIdClass(1);
		
		Student student = new Student("1234", "DB", "TEST", "ADD GMAIL", "09888", "89", course);
		
		StudentRepository rpst = new StudentRepository();
		rpst.addStudent(student);
		
		
		System.out.println("Finish!!!!");
	}

}
