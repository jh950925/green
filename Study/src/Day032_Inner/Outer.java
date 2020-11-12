package Day032_Inner;

class Outer{
	//멤버변수
	static int oi = 10;
	int		   oa;
	//멤버함수
	void show0() { System.out.println(oi+"-"+this.oa); }
	static void show1() {
		System.out.println(oi+"-");
	}
	@Override public String toString() { return "Outer [oa=" + oa + "]"; }
	//생성자
	public Outer() { super(); }
	////////////////////////////////////////////////
	class Inner1{
		int ii1 = 20;
		public void show2() { System.out.println(ii1); }
	}
	class Inner2{
		int ii2 = 20;
		public void show3() { System.out.println(ii2); }
	}
}
//////////////////////////////////////////////////////////////////////////////////////////
/*****
Inner 클래스 : 
1.class 안에 클래스가 있는 경우
2.외부에서 접근할 필요가 없는 클래스
3.내부클래스에서는 외부 클래스의 멤버처럼 사용

class Out(){
	class Inner()
}
=>Sdp$spdSocket.class
*/