package DataBase;

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
		st.setIduser(addUser(st));
		
		db.StoredProcdure("call add_student(?,?)");
		
		db.addParamInt(1, st.getIduser());
		db.addParamInt(2, st.getCourse().getIdClass());
		db.execute();
		
		db.close();
	}

	@Override
	public User serchById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchByIdentityCard(String identity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
