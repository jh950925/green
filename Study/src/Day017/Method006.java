package Day017;

public class Method006 {

	public static void main(String[] args) {

		System.out.println("[BASIC001] return 값이 있는 경우");
		int res1 = abs(-3);
		System.out.println(res1); //3
	}
	public static int abs(int num) {
		int result = 0;
		if(num<0) {
			result = -num;
		}else if(num>0) {
			result = num;
		}
		return result;
	}
}
