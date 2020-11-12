package Day028;

class Mother{
	int ma =10; int mb =20;

	public Mother() {
		super();
	}

	public Mother(int ma) {
		this.ma = ma;
	}
	public Mother(int ma, int mb) {
		super();
		this.ma = ma;
		this.mb = mb;
	}
	public void func() {
		System.out.println("==Mother");
	}
}
///////////////////////////////////////////////////////
class Daugther extends Mother{
	int mb =30; int mc =40;

	public Daugther() {
		super();
	}

	public Daugther(int ma, int mb) {
		super(ma, mb);
	}
	
	public Daugther(int ma, int mb, int mc) {
		super(ma);
		this.mb = mb;
		this.mc = mc;
	}
	@Override
	public void func() {
		System.out.println("ㅁㅁDaugther");
	}
}

public class Polymorphisml6 {
	public static void main(String[] args) {
		//////////////////////////////////////
		System.out.println(":::::: 1)TEST");
		Mother mo = new Mother();
		System.out.println("mo.ma : "+mo.ma); //10
		System.out.println("mo.mb : "+mo.mb); //20
		mo.func();//==Mother
		
		//////////////////////////////////////
		System.out.println(":::::: 2)TEST");
		Daugther da = new Daugther();
		System.out.println("da.ma : "+da.ma); //10
		System.out.println("da.mb : "+da.mb); //30 => Daugther 자손 클래스로 호출했기 때문에 30이 나온다.
		System.out.println("da.mc : "+da.mc); //40
		da.func(); //==Daugther
		
//		da = (Daugther) mo; // 자손 클래스로 선언된걸 조상 클래스에서 사용할 수 없다.
//		System.out.println(da);
		//////////////////////////////////////
		System.out.println(":::::: 3)TEST");
		Mother md = new Daugther();
		System.out.println("md.ma : "+md.ma); //10
		System.out.println("md.mb : "+md.mb); //20 = > 다시 Mother로 선언했기 때문에 20사용
		//System.out.println("md.mc : "+md.mc); // 조상 크래스로 자손클래스를 선언했기 때문에 오류가 난다. mc는 Daugther의 영역
		md.func(); 
		
		//////////////////////////////////////
		System.out.println(":::::: 4)TEST");
		System.out.println((float)10);			//10.0
//		Daugther dm = (Daugther) new Mother();	// 위와 다르게 Mother은 더 작은 공간을 가지고 있기 때문에 선언 자체가 불가

		//////////////////////////////////////
		System.out.println(":::::: 5)TEST");
		Mother md2 = da; 
		System.out.println("md2.ma : "+md2.ma); 	//10
		System.out.println("md2.mb : "+md2.mb); 	//20
		//System.out.println("md2.mc : "+md2.mc); 	//mc는 Daugther의 변수이기 때문에 오류가 난다.
		md2.func();
		//
	}
}
