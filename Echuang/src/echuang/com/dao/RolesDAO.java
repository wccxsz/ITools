package echuang.com.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository("roleDao")
public class RolesDAO extends BaseDAO implements AbstractRoleDAO {

	public RolesDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
