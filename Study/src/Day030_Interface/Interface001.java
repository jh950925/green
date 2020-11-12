package Day030_Interface;



// 1. [interface] : 기능을 구현하지 않은 추상메서드의 집함 [설계도]
// 2. [class]     : 멤버변수, 멤버함수 정의
// 3. [instance]  
 
//ver-1 인터페이스는 설계 클래스이다.
interface Animal{
	String name = "홍길동"; //자동으로 static final 형식 (공용이면서 수정 안되는 것들 : 회사명, 사업자등록번호 등등..)
	void eat(); //자동으로 abstract
}
//ver-2 Implements 구현한다는 뜻 - [부모클래스 구현클래스]
class Saram implements Animal{
	@Override
	public void eat() {
//		name = "아이유"; => final
		System.out.println(name + "이 밥을 먹어요");
	}
}
public class Interface001 {
	public static void main(String[] args) {
//		ver-1	
//		Animal ani = new Animal();
		System.out.println(Animal.name);//s(static).f(final)
		
//		ver-2
		Animal ani = new Saram();
		ani.eat();
	}
}
