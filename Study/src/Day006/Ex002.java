package Day006;

public class Ex002 {

	public static void main(String[] args) {
		int apples = 123;
		int box = 10;
		int result = apples / 10 + ((apples % 10 > 0)? 1 : 0);	
		
		System.out.println("필요한 바구니의 수 : " + result);



	}

}
