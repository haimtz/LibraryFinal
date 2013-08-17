package model;

public class Course 
{
	private int idClass;
	private String CourseName;
	private String ClassName;
	
	public Course(){ }
	
	public Course(int idClass)
	{
		super();
		this.idClass = idClass;
	}
	
	public Course(int idClass, String courseName, String className) {
		
		this(idClass);
		this.CourseName = courseName;
		this.ClassName = className;
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

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}
}
