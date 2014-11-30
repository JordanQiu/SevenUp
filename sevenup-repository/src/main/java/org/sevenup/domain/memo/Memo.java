package org.sevenup.domain.memo;

import java.util.Date;
import java.util.List;

public class Memo {
	private String title;
	private Date createdTime;
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
	
}
