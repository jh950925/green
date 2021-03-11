package com.company.dto;

public class MDto {

	private int no;
	private String id;
	private String name;
	private String pass;
	private String email;
	private String date;
	private String ip;
	private String phone;
	private String sns;
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public MDto() { super(); }
	public MDto(int no, String id, String name, String pass, String email, String date, String ip, String phone,
			String sns) {
		super();
		this.no = no;
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.date = date;
		this.ip = ip;
		this.phone = phone;
		this.sns = sns;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getId() { return id; } public void setId(String id) { this.id = id; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public String getPass() { return pass; } public void setPass(String pass) { this.pass = pass; }
	public String getEmail() { return email; } public void setEmail(String email) { this.email = email; }
	public String getDate() { return date; } public void setDate(String date) { this.date = date; }
	public String getIp() { return ip; } public void setIp(String ip) { this.ip = ip; }
	public String getPhone() { return phone; } public void setPhone(String phone) { this.phone = phone; }
	public String getSns() { return sns; } public void setSns(String sns) { this.sns = sns; }
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "MDto [no=" + no + ", id=" + id + ", name=" + name + ", pass=" + pass + ", email=" + email + ", date="
				+ date + ", ip=" + ip + ", phone=" + phone + ", sns=" + sns + "]";
	}
}
