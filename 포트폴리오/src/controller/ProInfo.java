package controller;

public class ProInfo {
	private String name;
	private String num;
	private String whr_name;
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/** 생성자 **/ 
	public ProInfo() { super(); }
	public ProInfo(String name, String num, String whr_name) { super(); this.name = name; this.num = num; this.whr_name = whr_name; }
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/** getter/setter **/
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public String getNum() { return num; } public void setNum(String num) { this.num = num; }
	public String getWhr_name() { return whr_name; } public void setWhr_name(String whr_name) { this.whr_name = whr_name; }
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "ProInfo [name=" + name + ", num=" + num + ", whr_name=" + whr_name + "]";
	}
}
