package org.sevenup.rest.controller;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.ResourceSupport;

/**
 * Account Class used in the rest perspective Developer can control the fields
 * 
 * @author steven.xu
 *
 */
public class Account extends ResourceSupport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7110628902672169040L;

	private String accountName;
	private String email;
	private String password;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}