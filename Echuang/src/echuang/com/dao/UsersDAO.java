package echuang.com.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UsersDAO extends BaseDAO implements AbstractUserDAO {
	
	public UsersDAO(SessionFactory sessionFactory){
		super(sessionFactory);
	}
}
