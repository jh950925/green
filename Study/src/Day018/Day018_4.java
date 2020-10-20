package Day018;

public class Day018_4 {

	public static void main(String[] args) {
		disp(7,'*');
	}
	
	public static void disp(int num, char ch) {
		System.out.print("결과값 : ");
		for(int i=1; i<=num; i++) {
			System.out.print(ch);
		}
	}
}
