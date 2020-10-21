package Day019;

public class Day019_3 {

	public static void main(String[] args) {

		//리턴 - (String)
		//파라미터 - (String,int)
		
		System.out.println(hi("sally", 2));
		
	}
	public static String hi(String A, int B) {
		String result = "";
		
		for(int i=1; i<=B; i++) {
			result += " 안녕!";
		}
		result = A+result;
		return result;
	}
}
