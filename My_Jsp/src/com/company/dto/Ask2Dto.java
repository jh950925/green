package com.company.dto;

public class Ask2Dto {
	private int no;
	private String title;
	private String content;
	public Ask2Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ask2Dto(int no, String title, String content) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Ask2Dto [no=" + no + ", title=" + title + ", content=" + content + "]";
	}
}
