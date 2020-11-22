package Day025_02;

public class Milk {

	private int mno;
	private String mname;
	private int mprice;

	// 생성자
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	
	@Override //DTO
	public String toString() {
		return "Milk [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
	public Milk() {
		super();
	}
	public Milk(int mprice) {
		super();
		this.mprice=mprice;
	}

}
