package Day017;

public class Method008 {

	public static void main(String[] args) {

		String a = "CHOCO", b="MILK";
		String res5 = add(a,b);
		System.out.println(res5);
	}
	
	public static String add(String a, String b) {
		String result = "";
		result = "맛있는 "+a+" "+b;
		
		return result;
	}
}
