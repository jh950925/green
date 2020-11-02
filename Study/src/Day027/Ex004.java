package Day027;

class Parent_Ex1 extends Object{
	int x = 100;
	Parent_Ex1(){
		this(200);
	}
	Parent_Ex1(int x){
		this.x=x;
	}
	int getX() {
		return x;
	}
}
class Child_Ex1 extends Parent_Ex1{
	int x =3000;
	Child_Ex1(){
		this(1000);
	}
	Child_Ex1(int x) {
		super();
		this.x=x;
	}
}

public class Ex004 {
	public static void main(String[] args) {

		Child_Ex1 c = new Child_Ex1();
		System.out.println("x="+c.getX());
	}
}
//chile_Ex1에서 3000이 먼저 들어가고 생성자 안의 1000값으로 초기화 되어 결국 1000
//int x가 파라미터인 Child_Ex1에서 this.x에 super()로 받은 x값을 위에서 가져온다.
//Parent_Ex1로 넘어가서 초기값 100 그 다음 200이 되어 return된다. 
//System.out.println("x="+c.getX()); 출력
