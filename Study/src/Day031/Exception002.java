package Day031;

public class Exception002 {
	public static void test(int a) throws Exception{
		System.out.println(10/a);
		System.out.println("처리완료!");
	}
	public static void main(String[] args) {
		try {
			test(1);
			test(0);
		}catch(Exception e) {
			System.out.println("Exception 발생!");
		}
	}
}
 