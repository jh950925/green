package Day026;

import java.util.Arrays;

import Day026_Class.ClassArr001_A;

public class ClassArr001 {
	public static void main(String[] args) {
//		[1]Class의 사용
//		int a; 
//		1. a1= null; A [name= , age=] 이러한 공간을 사용할 수 있는 자료형
//		2. new 공간 빌려오기
//		3. 생성자를 불러서 초기화 : A [name= , age=]
//		4. 사용할 수 있게 a가 주소를 가지고 있다.
		String name;
		ClassArr001_A a1 = new ClassArr001_A();
		a1.setName("Sally");
		a1.setAge(10);
		System.out.println(a1);
		
		
//		[2] 클래스배열
//		int [] a = new int[3];
		ClassArr001_A[] a2 =new ClassArr001_A[3];
//		(0) a2 = [a2[0]=null | a2[1]=null | a2[2]=null]
//		a2[0].setName("s1");
//		System.out.println(a2[0]); //오류발생
//		오류나는 이유1)System.out.println(Arrays.toString(a2));
//		오류나는 이유2)System.out.println(a2[0]); //null
//		1. a2[0] = null, A[name=, age= ] 이러한 인스턴스 공간을 만들 수 있음.
//		2. new 공간빌려오기
//		3. 생성자를 불러서 초기화 : A[name=null, ahe=0;]
//		4. a2[0]는 new해서 빌려온 공간의 주소를 갖고 있음.
//		a2[0].setName("s1");
//		5. (.)을 이용해서 접근해 s1데이터 셋팅이 가능함.
		
		a2[0] = new ClassArr001_A(); a2[0].setName("s1"); System.out.println(a2[0]);
		a2[1] = new ClassArr001_A(); a2[1].setName("s2"); System.out.println(a2[1]);
		a2[2] = new ClassArr001_A(); a2[2].setName("s3"); System.out.println(a2[2]);
	}
}
