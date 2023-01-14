package com.wch.ProjectPhonebook.Models;

import java.util.Date;

public class Commentary {
	String comment = null; // Комментарий
	Date date = null; // дата последнего изменения
	
	
	public Commentary(String comment) {
		this.comment = comment;
		this.date = new Date();
	}
	
	public Commentary() {
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
		this.date = new Date();
	}
	
	public Date getDate() {
		return date;
	}
	
	public void clearComment(){
		setComment("");
	}
}