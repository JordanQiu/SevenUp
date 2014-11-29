package org.sevenup.rest.domain.memo;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.ResourceSupport;

@XmlRootElement(name="memoItem")
@XmlAccessorType(XmlAccessType.FIELD)
public class MemoItem extends ResourceSupport implements Serializable {
	private Date dateTimeOfSubmission;
	private UUID key;
	private String title;
	private String description;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
