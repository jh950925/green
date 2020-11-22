package Day022;

class User002 {
	String name;
	int age;

	void show() {
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}// end show

	//★★★★★★★★★★★필수로 가져가야한다. 안에 비어있어도 무조건★★★★★★★★★★★
	User002() {
		name = "아이언맨";
		age = 55;
	}
}// end User002

public class Class007 {
	public static void main(String[] args) {
		// 1.객체만들기 - 붕어빵틀(클래스,object)로 붕어빵(실체화가 된것)만들기
		//             클래스를 사용하는 어떤 곳에서 new를 이용하여 객체를 만들고(공간빌려오기)
		//             User002() 실질적으로 유저가 사용한느 공간을 인스턴스변수(user)가 사용할 수 있게 생성자(User002)가 초기화해줌
		// 4.user 참조하는 곳에 주소를 갖음
		//
		User002 user = new User002(); // [name : 아이언맨 | age : 55 | show]
		user.show();

		User002 user2 = new User002();// user2 = [name : 아이언맨 | age : 55 | show]
		user2.name = "헐크";			  // user2 = [name : 헐크    | age : 10 | show]
		user2.age = 10;
		user2.show();
	}
}
/*
 1. 생성자
	- [초기화]하는 역할
	- [클래스 생성]할때 제일 먼저 실행되는 특수한 형태의 메서드
	- 메서드의 일반형식에는 리턴값이 있지만 생성자는 [리턴값이 없다].
		int	    		a(     ){}
		리턴값	   메서드명(파라미터){}
		
		class A{
			A(){} //생성자
		}
		
	- 생성자는 [클래스명과 동일]해야함.
	
 2. 기본 생성자를 반드시 선언해야 하는 경우
	- 하나의 클래스에 여러개의 생성자가 있을 수 있음.
	- [오버로딩]이 되면 기본 생성자는 자동으로 생성되지 않음.
	- 기본생성자는 하는 일이 없어도 [상속]시 에러를 발생하는 경우가 있으므로 수동적으로 무조건 선언하는 것을 권장함.
*/