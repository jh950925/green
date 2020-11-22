package Day017;

public class Method007 {

	public static void main(String[] args) {

		int res3 = max(3, 5, 7);
		System.out.println("최대값 : " + res3);
	}

	public static int max(int a, int b, int c) {
		int result = 0;
		result = a > b ? a 
				: c < b ? b 
				: c;
		
		return result;
	}

}
