package Day022;

class Student003 {
	// 멤버변수
	String name;
	int ban, no, kor, eng, math, total;
	String aver;

	// 멤버함수
	public int getTotal() {
		this.total = this.kor + this.eng + this.math; 
		return total;
	}

	public String getAverage() {
		this.aver = String.format("%.2f", (this.total / 3.0));
		return this.aver;
	}
 
	public String info() {
		String result = "";
		result = ("" + this.name
				+ "," + this.ban 
				+ "," + this.no 
				+ "," + this.kor 
				+ "," + this.eng 
				+ "," + this.math 
				+ "," + getTotal()
				+ "," + getAverage());
		return result;
	}

	// 생성자 
	Student003() {

	}

	Student003(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}


public class Ex005 {
	public static void main(String[] args) {
		Student003 c3 = new Student003("홍길동", 1, 1, 100, 60, 76);
		System.out.println();
		System.out.println(c3.info());
	}
}
