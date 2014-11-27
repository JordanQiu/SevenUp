package org.sevenup.service.user;

import java.util.ArrayList;
import java.util.List;

import org.sevenup.repository.user.User;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<User> findUsers() throws DataAccessException {
		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User tempUser = new User();
			tempUser.setUid("nonumber-"+i);
			tempUser.setLocactionId("city-"+i);
			tempUser.setName("sevenup-"+i);
			userList.add(tempUser);
		}
		return userList;
	}

	@Override
	public User findUserById(Long id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Long id) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}

}
