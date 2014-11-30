package org.sevenup.repository;

import java.util.List;

import com.mongodb.WriteResult;

public interface Repository<T> {
	public List<T> getAllObjects();
	
	public void saveObject(T user);
	
	public T getObject(String id);
	
	public void deleteObejct(String id);
	
	public WriteResult updateObject(String id, String username);
	
	public void createCollection();
	
	public void dropCollection();
}
