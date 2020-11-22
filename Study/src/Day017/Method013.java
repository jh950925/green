package Day017;

public class Method013 {

	public static void main(String[] args) {

		System.out.println("[BASIC002] 윤년인지, 평년인지 판단해서 윤년이면 true, 평년이면 false 리턴");
		System.out.println();
		if(leap(2020)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
	}
	public static boolean leap(int num) {
		if(num%4==0 && num%100!=0 || num%400==0) {
			return true;
		}else {
			return false;
		}
	}

}
