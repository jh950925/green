package Day024;

class Animal_static {
	// 멤버변수 (클래스 변수, 인스턴스 변수)
	String name;
	int age;
	// ver-1
	static String Company = "(주)동물농장";
	static int animal_num = 10;
	// ver-2
	static String Boss;  
	static String Location;
	static {
		Boss = "신동엽"; 
		Location = "여의도";
	}
 
	// 멤버함수
	// 클래스함수(Static : Method영역)
	public static void num_plus() {
		animal_num++;
	} 

	// 인스턴스 함수(new) : Heap영역
	public void show() {
		System.out.println("\n\n::::::::::::::::::::::::");
		System.out.println("::회사명 : " + Animal_static.Company);
		System.out.println("::이 름 : " + this.name);
		System.out.println("::나 이 : " + this.age);
		System.out.println("::식구수 : " + Animal_static.animal_num);
	}

	@Override
	public String toString() {
		return "Animal_static [name=" + name + ", age=" + age + "]";
	}

	// 생성자
	public Animal_static() {
		super();
	}

	public Animal_static(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

public class Class021_static {
	public static void main(String[] args) {
		System.out.println("ㅁ회사명 : " + Animal_static.Company);
		System.out.println("ㅁ식구수 : " + Animal_static.animal_num);
		System.out.println("ㅁ사장님 : " + Animal_static.Boss);
		System.out.println("ㅁ위 치 : " + Animal_static.Location);

		// 1. Animal_static한 자료형으로 사용할 수 있는 인스턴스 공간든 [name, age= ]
		// 2. new : 공간 빌려오기
		// 3. Animal_static() 생성자는 초기화 - Animal_static[name=null, age=0]
		// 4. cat이 주소를 가지고 있으므로 접근해서 사용이 가능함.
		Animal_static cat = new Animal_static();
		cat.name = "Sally";			//[name = Sally]
		cat.age = 10;				//[age = 10]
		//위에 2개는 Heap Area
		//cat.num_plus(); 권장사항이 아님
		Animal_static.num_plus(); // static 붙어있으면 무조건 클래스명.멤버함수를 사용해야한다.
		//위에는 Mehtod Area
		cat.show();				 //heap Area
	}
}
