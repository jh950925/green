package com.company.dto;

public class AskDto {
	private int no;
	private String category;
	public AskDto() {
		super();
	}
	public AskDto(int no, String category) {
		super();
		this.no = no;
		this.category = category;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "AskDto [no=" + no + ", category=" + category + "]";
	}
}
