package DataBase;

import java.util.List;

import model.User;

public abstract class UserRepository extends Repository {

	public UserRepository() throws Exception {
		super();
	}

	@Override
	public <T> void add(T t) throws Exception {
		
		if( !(t instanceof User))
			throw new Exception("Only Users");

	}
	
	protected int addUser()
	{
		return 0;
	}

	@Override
	public <T> List<T> getList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
