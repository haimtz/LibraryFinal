package DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Student;
import model.User;

public class StudentRepository extends UserRepository {

	public StudentRepository() throws Exception {
		super();
	}
	
	public void addStudent(Student st) throws SQLException
	{ 
		int idUser =  addUser(st);
		st.setIduser(idUser);
		
		db.StoredProcdure("call add_student(?,?)");
		
		db.addParamInt(1, st.getIduser());
		db.addParamInt(2, st.getCourse().getIdClass());
		db.execute();
		
		db.close();
	}

	@Override
	public Student serchById(int id) throws Exception {
		
		
		db.StoredProcdure("SELECT users.iduser, users.username, users.lastname, courses.courseName, classes.startYear " +
				"FROM users " +
				"INNER JOIN students ON students.idstudent = users.iduser " +
				"INNER JOIN classes ON students.idclass = classes.idclass " +
				"INNER JOIN courses ON classes.idcourse = classes.idcourse " +
				"WHERE iduser = ?");
		
		db.addParamInt(1, id);
		
		ResultSet result = db.resultQuery();
		Student studentResult = new Student();
		
		while(result.next())
		{
			studentResult.setIduser(result.getInt("iduser"));
			studentResult.setUsername(result.getString("username"));
			studentResult.setLastName("lastname");
			
			// TODO fill all the fields
		}
		
		
		return studentResult;
	}

	@Override
	public User searchByIdentityCard(String identity) throws Exception {

		db.StoredProcdure("SELECT users.iduser, users.username, users.lastname, courses.courseName, classes.startYear " +
				"FROM users " +
				"INNER JOIN students ON students.idstudent = users.iduser " +
				"INNER JOIN classes ON students.idclass = classes.idclass " +
				"INNER JOIN courses ON classes.idcourse = classes.idcourse " +
				"WHERE users.identityCard = ?");
		
		db.addParamString(1, identity);
		
		ResultSet result = db.resultQuery();
		Student studentResult = new Student();
		
		while(result.next())
		{
			studentResult.setIduser(result.getInt("iduser"));
			studentResult.setUsername(result.getString("username"));
			studentResult.setLastName("lastname");
			
			// TODO fill all the fields
		}
		
		
		return studentResult;
	}

	@Override
	public User searchName(String name) throws Exception {
		
		db.StoredProcdure("SELECT users.iduser, users.username, users.lastname, courses.courseName, classes.startYear " +
				"FROM users " +
				"INNER JOIN students ON students.idstudent = users.iduser " +
				"INNER JOIN classes ON students.idclass = classes.idclass " +
				"INNER JOIN courses ON classes.idcourse = classes.idcourse " +
				"WHERE users.username = ?");
		
		db.addParamString(1, name);
		
		ResultSet result = db.resultQuery();
		Student studentResult = new Student();
		
		while(result.next())
		{
			studentResult.setIduser(result.getInt("iduser"));
			studentResult.setUsername(result.getString("username"));
			studentResult.setLastName("lastname");
			
			// TODO fill all the fields
		}
		
		
		return studentResult;
	}

	@Override
	public List<User> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
