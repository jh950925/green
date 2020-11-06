package Day027;

class MoblieNote7 {
	private String iris; //홍채색상

	public void newShow() {
		System.out.println("::::NOTE7 새로운 기능(Overriding)");
		System.out.println("iris 홍채인식 기능!");
		System.out.println("iris : " + this.iris);
	}
	public String getIris() {
		return iris;
	} 
	public void setIris(String iris) {
		this.iris = iris;
	}
	public MoblieNote7() {
		super();
	}
}
/////////////////////////////////////////////
class MoblieNote8 extends MoblieNote7{ //##1. 상속 받고
	private String face; 

	public void newShow() {
		super.newShow();
		System.out.println();
		System.out.println("::::NOTE8 새로운 기능(Overriding)");
		System.out.println("face 홍채인식 기능!");
		System.out.println("face : " + this.face);
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public MoblieNote8() {
		super();
	} 
}
///////////////////////////////////////////////
class MoblieNote9 extends MoblieNote8{ // ##2. 무보메서드와 같은게 있다면 => Override : 상속, 부모메서드와 같다면
	private int battery;
	public void newShow() {
		super.newShow(); // 부모 호출
		System.out.println();
		System.out.println("::::NOTE9 새로운 기능(Overriding)"); //새로운 메서드부분만 추가 수행
		System.out.println("battery 하루종일 사용가능!");
		System.out.println("battery : " + battery);
	}

	public MoblieNote9() {
		super();
		this.battery=24;
	}

	public MoblieNote9(int battery) {
		super();
		this.battery = battery;
	}
	
}
/////////////////////////////////////
public class Extends003 {
	public static void main(String[] args) {

		MoblieNote9 my9 = new MoblieNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newShow();
		
	}
}
