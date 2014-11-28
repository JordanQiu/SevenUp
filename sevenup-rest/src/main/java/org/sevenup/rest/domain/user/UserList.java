package org.sevenup.rest.domain.user;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userList")
public class UserList {
	 private List<User> userList;  
	  
	 protected UserList() {  
		 
	 }
	@XmlElement
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}  
}
