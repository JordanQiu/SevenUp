package org.sevenup.service.user;

import java.util.List;

import org.sevenup.repository.user.User;
import org.springframework.dao.DataAccessException;


public interface UserService {
    List<User> findUsers() throws DataAccessException;

    User findUserById(Long id) throws DataAccessException;

    void saveUser(User user) throws DataAccessException;

    void deleteUser(Long id) throws DataAccessException;

}
