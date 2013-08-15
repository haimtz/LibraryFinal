package model;


public class CourseCoordinator extends Lecturer
{
	private Course Specialization;
	
	
	public CourseCoordinator()
	{
		
	}
	
	public CourseCoordinator (String name , String lname , String address , String cardNumber , 
							  Course specialization, Course... courses)
	{
		super (name,lname,address,cardNumber,courses);
		Specialization = specialization;
	}
	
	public Course getCourseSpecialization() {
		return Specialization;
	}

	public void setCourseSpecialization(Course specialization) {
		Specialization = specialization;
	}

	public String toString() {
		return "CourseCoordinator details:\n" +
				super.toString() + 
				"\nCourseSpecialization = " + Specialization;
	}
	
}
