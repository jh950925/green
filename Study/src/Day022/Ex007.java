package Day022;

class MyPoint {
	// 멤버변수
	int num1, num2;

	// 멤버함수
	public double getDistance(int num1, int num2) {

		double result = Math.sqrt(Math.pow((num1 - this.num1), 2) + Math.pow((num2 - this.num2), 2));

		return result;
	}

	// 생성자
	MyPoint(){
	
	}
	public MyPoint(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}
public class Ex007 {
	public static void main(String[] args) {

		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}
}
