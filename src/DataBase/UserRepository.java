package DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.User;

public abstract class UserRepository extends Repository {

	private User user;
	
	public UserRepository() throws Exception {
		super();
	}

	/**
	 * @param T t user only
	 */
	@Override
	public <T> void add(T t) throws Exception {
		
		if( !(t instanceof User))
			throw new Exception("Only Users");
		
		user = (User)t;
		addUser();

	}

	@Override
	public <T> List<T> getList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * insert user into user table
	 * @return id user
	 */
	protected synchronized int addUser() throws SQLException
	{
		int returnId;
		
		// call to the stored procedure
		db.StoredProcdure("call add_user(?,?,?,?,?,?,?)");
		
		//set the parameters
		db.addParamString(1, user.getIdentityCard());
		db.addParamString(2, user.getUsername());
		db.addParamString(3, user.getLastName());
		db.addParamString(4, user.getDeliveryAddress());
		db.addParamString(5, user.getCreditNumber());
		db.addParamBoolean(6, true);
		db.addParamBoolean(7, false);
		
		ResultSet result = db.resultQuery();
		returnId = result.getInt("iduser");
		
		//close connection
		db.close();
		
		return returnId;
	}

}
