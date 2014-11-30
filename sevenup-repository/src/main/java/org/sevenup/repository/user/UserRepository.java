package org.sevenup.repository.user;


import java.util.List;

import org.sevenup.domain.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.mongodb.WriteResult;

@Component
public class UserRepository implements CrudRepository<User,Long>{
	@Autowired
	@Qualifier("mongoTemplate")
	MongoTemplate mongoTemplate;
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long id) {
		mongoTemplate.remove(new Query(Criteria.where("id").is(id)), User.class);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends User> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll() {
		return mongoTemplate.findAll(User.class);
	}

	@Override
	public Iterable<User> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(Long id) {
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), User.class);
	}

	@Override
	public <S extends User> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
