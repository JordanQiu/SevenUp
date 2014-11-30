package org.sevenup.rest.domain.memo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.ResourceSupport;

@XmlRootElement(name="memo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Memo extends ResourceSupport implements Serializable {
	private Date dateTimeOfSubmission;
	private UUID key;
	private String title;
	private Date createdTime;
	@XmlElement(name="memoItem")
	private List<MemoItem> items;
	
	public Date getDateTimeOfSubmission() {
		return dateTimeOfSubmission;
	}

	public void setDateTimeOfSubmission(Date dateTimeOfSubmission) {
		this.dateTimeOfSubmission = dateTimeOfSubmission;
	}

	public UUID getKey() {
		return key;
	}

	public void setKey(UUID key) {
		this.key = key;
	}

	public List<MemoItem> getItems() {
		return items;
	}

	public void setItems(List<MemoItem> items) {
		this.items = items;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	
}
