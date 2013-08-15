package model;


public class Student extends User
{
	private String StudyYear;
	private Course Course;
	
	
	public Student()
	{
		super();
	}
	
	public Student (String name , String lname , String address , String cnumber , 
					String studyyear , Course course)
	{
		super (name, lname, address, cnumber);
		
		StudyYear = studyyear;
		Course = course;
	}

	public String getStudyYear() {
		return StudyYear;
	}

	public void setStudyYear(String studyYear) {
		StudyYear = studyYear;
	}

	public Course getCourse() {
		return Course;
	}

	public void setCourse(Course course) {
		Course = course;
	}

	public String toString() 
	{
		return "Student details:" + super.toString() + 
				"\nStudy Year = " + StudyYear + 
				"\nCourse = " + Course;
	}
}
