package echuang.com.service;

import echuang.com.model.Role;
import echuang.com.model.User;

public interface AbstractUserService {
	public User addUser(User u);
	public Role addRole(Role entity);
}
