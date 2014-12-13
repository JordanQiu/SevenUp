package org.sevenup.service.user;

import java.util.List;

import org.sevenup.common.util.CollectionConverter;
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
		//create the repository
		userRepository.createCollection();
	}
	@Override
	public List<User> findUsers() throws DataAccessException {
		List<User> userList =CollectionConverter.toList(userRepository.findAll());
		return userList;
	}

	@Override
	public User findUserById(Long id) throws DataAccessException {
		return userRepository.findOne(id);
	}

	@Override
	public User saveUser(User user) throws DataAccessException {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long id) throws DataAccessException {
		userRepository.delete(id);
	}

}
