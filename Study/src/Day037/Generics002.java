package Day037;

import java.util.ArrayList;
import java.util.Iterator;

class GenericsInfo{
	private String name;
	private int age;
	public GenericsInfo() { super(); }
	public GenericsInfo(String name, int age) { super(); this.name = name; this.age = age; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	@Override
	public String toString() {
		return "GenericsInfo [name=" + name + ", age=" + age + "]";
	}
}

public class Generics002 {
	public static void main(String[] args) {
		ArrayList<GenericsInfo> list = new ArrayList<GenericsInfo>();
		int total=0;
		list.add(new GenericsInfo("아이언맨",50));
		list.add(new GenericsInfo("헐크",40));
		list.add(new GenericsInfo("캡틴",120));
		
		Iterator<GenericsInfo> iter = list.iterator();
		
		while(iter.hasNext()) {
			GenericsInfo temp = iter.next();
			total += temp.getAge();
		}
		System.out.println("평균나이 : " + total/list.size() +"살");
	}
}
