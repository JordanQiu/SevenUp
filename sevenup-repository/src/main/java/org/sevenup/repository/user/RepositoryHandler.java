package org.sevenup.repository.user;


import java.util.List;

import org.sevenup.domain.user.User;
import org.sevenup.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.mongodb.WriteResult;

@Component
public class RepositoryHandler implements Repository<User>{

	@Autowired
	@Qualifier("mongoTemplate")
	MongoTemplate mongoTemplate;
	
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public List<User> getAllObjects() {
		return mongoTemplate.findAll(User.class);
	}

	public void saveObject(User user) {
		mongoTemplate.save(user);   
		//save:save or update; insert:just insert
	}

	public User getObject(String id) {
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), User.class);
	}

	public void deleteObejct(String id) {
		mongoTemplate.remove(new Query(Criteria.where("id").is(id)), User.class);
	}

	public WriteResult updateObject(String id,String username) {
		return mongoTemplate.updateFirst(new Query(Criteria.where("id").is(id)),
				Update.update("username", username), User.class);
	}

	public void createCollection() {
		
		if(mongoTemplate.collectionExists(User.class)){
			mongoTemplate.createCollection(User.class);
		}
	}

	public void dropCollection() {
		System.out.println(mongoTemplate == null);
		if(mongoTemplate.collectionExists(User.class)){
			mongoTemplate.dropCollection(User.class);
		}
	}
	
}
