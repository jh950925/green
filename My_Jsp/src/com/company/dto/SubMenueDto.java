package com.company.dto;

public class SubMenueDto {
	private int no;
	private String title;
	private String submenue;
	private String product;
	private String product_img;
	public SubMenueDto() {
		super();
	}
	public SubMenueDto(int no, String title, String submenue, String product, String product_img) {
		super();
		this.no = no;
		this.title = title;
		this.submenue = submenue;
		this.product = product;
		this.product_img = product_img;
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
	public String getSubmenue() {
		return submenue;
	}
	public void setSubmenue(String submenue) {
		this.submenue = submenue;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getProduct_img() {
		return product_img;
	}
	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}
	@Override
	public String toString() {
		return "SubMenueDto [no=" + no + ", title=" + title + ", submenue=" + submenue + ", product=" + product
				+ ", product_img=" + product_img + "]";
	}
}
