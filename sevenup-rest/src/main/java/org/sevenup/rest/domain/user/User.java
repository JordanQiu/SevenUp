package org.sevenup.rest.domain.user;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;
@XmlRootElement(name = "user")
public class User extends ResourceSupport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4812842277593070333L;
//	private Long id;
	private String uid;
	private String name;
	private String avatar;
	private String alt;
	private String relation;
	private String createdTime;
	private String locactionId;
	private String locactionName;
	private String description;

	public String getUid() {
		return uid;
	}
	@XmlElement  
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	@XmlElement  
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	@XmlElement  
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAlt() {
		return alt;
	}
	@XmlElement  
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getRelation() {
		return relation;
	}
	@XmlElement  
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getCreatedTime() {
		return createdTime;
	}
	@XmlElement  
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	public String getLocactionId() {
		return locactionId;
	}
	@XmlElement  
	public void setLocactionId(String locactionId) {
		this.locactionId = locactionId;
	}
	public String getLocactionName() {
		return locactionName;
	}
	@XmlElement  
	public void setLocactionName(String locactionName) {
		this.locactionName = locactionName;
	}
	public String getDescription() {
		return description;
	}
	@XmlElement  
	public void setDescription(String description) {
		this.description = description;
	}
	
}
