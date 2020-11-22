package Day026_Class;

public class ClassArr001_A {
	// 멤버변수
	private String name;
	private int age;
	//멤버함수
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}
	// 생성자
	public ClassArr001_A() {
		super();
	}
	public ClassArr001_A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
