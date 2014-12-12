package org.sevenup.service.user;

import java.util.ArrayList;
import java.util.List;

import org.sevenup.domain.user.User;
import org.sevenup.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceHandler implements UserService{

	private UserRepository userRepository;
	@Autowired
	public UserServiceHandler(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findUsers() throws DataAccessException {
		userRepository.dropCollection();
        
		userRepository.createCollection();
        for(int i =0;i<15;i++){
        	User user= new User();
        	user.setName("number"+i);
        	user.setCreatedTime("2014-12-23");
        	user.setLocactionId("test");
        	userRepository.save(user);
        }
		List<User> userList = new ArrayList<User>();
		Iterable<User> iterable = userRepository.findAll();
	    if(iterable != null) {
	        for(User user: iterable) {
	        	userList.add(user);
	        }
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
