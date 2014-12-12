package org.sevenup.repository.user;

import org.sevenup.domain.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{
	
	public void createCollection();
	
	public void dropCollection();
	
}
