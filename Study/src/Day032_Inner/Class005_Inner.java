package Day032_Inner;

public class Class005_Inner {
	public static void main(String[] args) {
		Outer005 user1 = new Outer005();
		user1.setUser("홍길동");
		Outer005.Inner1 inner1 = new Outer005().new Inner1();
		Outer005.Inner2 inner2 = new Outer005().new Inner2();
		inner2.setSerial("p-"+(int)(Math.random()*99999)+1);
		
		System.out.println(" - 사용자명 : " + user1.getUser());
		System.out.println(" - 회 사 명 : " + Outer005.Inner1.NAME);
		System.out.println(" - 사업자등록번호 : " + inner1.COMPANY_NUM);
		System.out.println(" - 제품씨리얼번호 : " + inner2.getSerial());
		
	}
}
