package model;


public class Lecturer extends User
{
	protected Course[] Courses;
	
	
	public Lecturer()
	{
		super();
	}
	
	public Lecturer (String name , String lname , String address , String cnumber , Course... courses)
	{
		super (name,lname,address,cnumber);
		
		Courses = courses;
	}

	public Course[] getCourses() {
		return Courses;
	}

	public void setCourses(Course... course) {
		
		Courses = course;
	}
	
	private String TeachingCourse()
	{
		String str = "";
		
		for(Course cs : Courses)
		{
			str += "\n" + cs.toString();
		}
		
		return str;
	}

	public String toString() 
	{
		return "Lecturer details:\n" + super.toString() + 
				"\nTeaching Courses = " + TeachingCourse();
	}
}
