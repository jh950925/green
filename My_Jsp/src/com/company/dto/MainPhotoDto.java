package com.company.dto;

public class MainPhotoDto {
	private int no;
	private String img;
	public MainPhotoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MainPhotoDto(int no, String img) {
		super();
		this.no = no;
		this.img = img;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "MainPhoto [no=" + no + ", img=" + img + "]";
	}
}
