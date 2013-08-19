package model;

public class Course 
{
	private int idClass;
	private String CourseName;
	private String year;
	
	public Course(){ }
	
	public Course(int idClass)
	{
		super();
		this.idClass = idClass;
	}
	
	public Course(int idClass, String courseName, String year) {
		
		this(idClass);
		this.CourseName = courseName;
		this.year = year;
	}

	public int getIdClass() {
		return idClass;
	}

	public void setIdClass(int idClass) {
		this.idClass = idClass;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
