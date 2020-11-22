package Day022;

class Distance {
	// 멤버변수
	int num1, num2;

	// 멤버함수
	public double getDistance(int num1, int num2, int num3, int num4) {
		double result = Math.sqrt(Math.pow((num3-num1),2)+Math.pow((num4-num2),2));
		return result;
	} 

	// 생성자
	Distance() {

	}
}

public class Ex006 {
	public static void main(String[] args) {
		Distance d = new Distance();
		System.out.println("객체 찍어서 사용 일반메서드 : " + d.getDistance(1, 1, 2, 2));
		System.out.println("클래스 멤버함수 이용 : " + getDistance(1, 1, 2, 2));
	}

	public static double getDistance(int a, int b, int c, int d) {
		double result = Math.sqrt(Math.pow((c-a),2)+Math.pow((d-b),2));
		return result; 
	}
}
