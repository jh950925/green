package Day012_2;

public class Ex009_2 {

	public static void main(String[] args) {

		String str = "12345";

		int sum = 0;

//		sum += str.charAt(0) - '0';System.out.println(sum);
//		sum += str.charAt(1) - '0';System.out.println(sum);
//		sum += str.charAt(2) - '0';System.out.println(sum);
//		sum += str.charAt(3) - '0';System.out.println(sum);
//		sum += str.charAt(4) - '0';System.out.println(sum);
		
		//5 : 문자열.length() => 문자열의 개수
		for(int i = 0; i<str.length(); i++) {
			sum += (str.charAt(i) -'0');
		}
		System.out.print(sum);
	}

}
