package Day003;

public class Ex003_value {

	public static void main(String[] args) {
		System.out.println("값의 종류 : 리터럴 / 상수 / 변수\n");
		
		
		
		System.out.println("1.리터럴");
		System.out.println(10); // 그 자체의 값을 의미
		System.out.println("abc\n\n"); // 리터럴 10, "abc"
		
		
		
		System.out.println("2.상수"); //변하는 데이터값을 저장하는 공간
		int a = 100000;
		int b = 34000;
		int c = 20000;
		
		int total = 100000;
		int d = total - 34000;
		int e = d - 20000;
		
		System.out.println("마트에 들어가기 전 : " + a +"원");
		System.out.println("삼겹살 산 후 지갑의 돈 : " + (a-b) +"원");
		System.out.println("와인 산 후 지갑의 돈 : " + (a-b-c) +"원\n");
		
		System.out.println("마트에 들어가기 전 : " + total +"원");
		System.out.println("삼겹살 산 후 지갑의 돈 : " + d +"원");
		System.out.println("와인 산 후 지갑의 돈 : " + e +"원\n\n");
		
		System.out.println("3.변수");
		
		

	}

}
