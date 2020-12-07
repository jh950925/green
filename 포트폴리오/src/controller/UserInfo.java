package controller;

public class UserInfo {
	private String name;
	private String id;
	private String pass;
	private String pass_chk;
	private String mail;
	private String phno;
	private String userDate;
	private String UserNo;
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public UserInfo(String name, String id, String pass, String pass_chk, String mail, String phno, String userDate, String userNo) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.pass_chk = pass_chk;
		this.mail = mail;
		this.phno = phno;
		this.userDate = userDate;
		this.UserNo = userNo;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// name
	public String getName() { return name; }  
	public void setName(String name) { this.name = name; }

	// id
	public String getId() { return id; }  
	public void setId(String id) { this.id = id; }

	// pass
	public String getPass() { return pass; }  
	public void setPass(String pass) { this.pass = pass; }

	// pass_chk
	public String getPass_chk() { return pass_chk; }  
	public void setPass_chk(String pass_chk) { this.pass_chk = pass_chk; }

	// mail
	public String getMail() { return mail; }  
	public void setMail(String mail) { this.mail = mail; }

	// phno
	public String getPhno() { return phno; }  
	public void setPhno(String phno) { this.phno = phno; }

	// userdate
	public String getUserDate() { return userDate; }  
	public void setUserDate(String userDate) { this.userDate = userDate; }

	// userNo
	public String getUserNo() { return UserNo; } 
	public void setUserNo(String userNo) { UserNo = userNo; }
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", id=" + id + ", pass=" + pass + ", pass_chk=" + pass_chk + ", mail=" + mail
				+ ", phno=" + phno + ", userDate=" + userDate + ", UserNo=" + UserNo + "]";
	}
}
