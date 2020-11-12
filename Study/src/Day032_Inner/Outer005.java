package Day032_Inner;

public class Outer005 {
	String user;
	class Inner1{
		static final String NAME = "(주)회사";
		String COMPANY_NUM = "2020-05-";
		Inner1() {
			this.COMPANY_NUM = COMPANY_NUM + (int)(Math.random()*99999)+1;
		}
	}	
	//"2020-05-"+(int)(Math.random()*99999)+1
	class Inner2{
		private String Serial;
		public String getSerial() {
			return Serial;
		}
		public void setSerial(String serial) {
			Serial = serial;
		}
	}
	public String getUser() { return user; }
	public void setUser(String user) { this.user = user; }
}
