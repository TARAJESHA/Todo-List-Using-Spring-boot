package com.inLearing.Springboot.myfirstwebapp.todo;

import java.time.LocalDate;

public class Todo {
	private int id;
	private String userName;
	private String discription;
	private LocalDate targetDate;
	private boolean done;

	public Todo(int id, String userName, String discription, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.userName = userName;
		this.discription = discription;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + userName + ", discription=" + discription + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}

}
