package com.company.dto;

public class MainCategoryDto {
	private int no;
	private String title;
	public MainCategoryDto() {
		super();
	}
	public MainCategoryDto(int no, String title) {
		super();
		this.no = no;
		this.title = title;
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
	@Override
	public String toString() {
		return "MainCategory [no=" + no + ", title=" + title + "]";
	}
}
