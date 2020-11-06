package Day027;

class Parent_Ex1 extends Object{
	int x = 100;
	Parent_Ex1(){
		this(200);
		System.out.println("ㅁ Parent_ex1() 디폴트 생성자 : x="+this.x);
	}
	Parent_Ex1(int x){
		this.x=x;
		System.out.println("ㅁ Parent_ex1() 파라미터가 있는 생성자 : x="+this.x);
	}
	int getX() {
		return x;
	}
}
class Child_Ex1 extends Parent_Ex1{
	int x =3000;
	Child_Ex1(){
		this(1000);//1번
		System.out.println("ㅁ Child_Ex1() 디폴트 생성자 : x="+this.x);
	}
	Child_Ex1(int x) {//3번
		super();
		this.x=x;
		System.out.println("ㅁ Child_Ex1() 디폴트 생성자 : x="+this.x);
	}
}

public class Ex004 {
	public static void main(String[] args) {
		//생성되는 순서 : Object => Parent_Ex1 => Child_Ex1
//		호출되는 순서 : Child_Ex1 디폴트 생성자 => Child_Ex1(int x)  파라미터 생성자 : x=1000 
//		=> Parent_Ex1()  디폴트 생성자 => Parent_Ex1() 파라미터가 있는 생성자 : x=200
		//////////////////////////////////
		//Object 		[	멤버변수			,	멤버함수	]
		//Parent_Ex1	[	x=200			,	getx()	]
		//Child_Ex1		[	x=1000			,		]
		
		Child_Ex1 c = new Child_Ex1();
		System.out.println("x="+c.getX());
	}
}
