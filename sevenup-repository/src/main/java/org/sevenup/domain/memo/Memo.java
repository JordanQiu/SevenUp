package org.sevenup.domain.memo;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="memo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Memo {
	private String title;
	private Date createdTime;
	private Date dealineTime;
	@XmlElement(name="memoItem")
	private List<MemoItem> items;
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
	public List<MemoItem> getItems() {
		return items;
	}
	public void setItems(List<MemoItem> items) {
		this.items = items;
	}
	public Date getDealineTime() {
		return dealineTime;
	}
	public void setDealineTime(Date dealineTime) {
		this.dealineTime = dealineTime;
	}
	
}
