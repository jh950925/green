package Day022;

class Student001{
	//멤버변수
	String name;
	int ban,no,kor,eng,math;
	
	//멤버함수
	@Override
	public String toString() {
		String result ="";
		result = ("[name="+this.name
				+", ban="+this.ban
				+", no="+this.no
				+", kor="+this.kor
				+", eng="+this.eng
				+", math="+this.math); 
		return result;
	} 
	//생성자
	Student001(){
		
	}
}

public class Ex003 {
	public static void main(String[] args) {
		Student001 s1 = new Student001();
		System.out.println(s1);
	}
}
