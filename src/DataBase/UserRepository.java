package DataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.User;

public abstract class UserRepository extends Repository {
	
	public UserRepository() throws Exception {
		super();
	}
	

	// declare abstract methods
	public abstract List<User> getUserList() throws Exception;
	
	public abstract User serchById(int id) throws Exception;
	
	public abstract User searchByIdentityCard(String identity) throws Exception;
	
	public abstract User searchName(String name) throws Exception;
	
	/**
	 * insert user into user table
	 * @return id user
	 */
	public synchronized int addUser(User user) throws SQLException
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
		if(result.next())
			returnId = result.getInt("iduser");
		else
			returnId = -1;
		
		//close connection
		db.close();
		
		return returnId;
	}

}
