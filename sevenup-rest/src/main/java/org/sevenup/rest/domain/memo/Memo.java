package org.sevenup.rest.domain.memo;

import java.io.Serializable;

import org.springframework.hateoas.ResourceSupport;

public class Memo extends ResourceSupport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1880799317923812995L;
	
//	private long id;
	private String title;
	private String subTitle;
	private String description;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
