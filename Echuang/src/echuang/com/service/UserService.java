package echuang.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import echuang.com.dao.AbstractRoleDAO;
import echuang.com.dao.AbstractUserDAO;
import echuang.com.model.*;

@Service("userService")
@Transactional
public class UserService implements AbstractUserService {
	
	@Autowired
	private AbstractUserDAO userDao;	
	
	@Autowired
	private AbstractRoleDAO roleDao;
	
	public AbstractUserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(AbstractUserDAO userDao) {
		this.userDao = userDao;
	}	

	public AbstractRoleDAO getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(AbstractRoleDAO roleDao) {
		this.roleDao = roleDao;
	}
	
	public Role addRole(Role entity){
		return roleDao.save(entity);
	}
	
	public User addUser(User u){
		return userDao.save(u);
	}
	
	
}
