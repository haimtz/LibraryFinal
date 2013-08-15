package model;

public class Course 
{
	private int idCourse;
	private String name;
	
	public Course(){ };
	
	public Course(int id, String name)
	{
		this.setIdCourse(id);
		this.setName(name);
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
