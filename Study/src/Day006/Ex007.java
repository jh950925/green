package Day006;

public class Ex007 {

	public static void main(String[] args) {
		
		byte a = 10;  					//이상 x
		byte b = 20;  					//이상 x
		byte c =(byte)(a+b) ;			// 아까 했던것 처럼 int로 선언되기 때문에 형변환을 시켜준다
			
		char ch = 'A';					//이상 x
		ch =  (char) (ch + 2) ;			// 위와 동일하게 형변환


		float f = 3 / 2f;  				//float은 f붙히기	
		long l = 3000 * 3000 * 3000L;	//long은 L
		
		float f2 = 0.1f; 				//이상 x
		double d = 0.1;  				//이상 x
		boolean result = (float)d == f2;		//????
		
		System.out.println("c="+c);
		System.out.println("ch=" +ch);
		System.out.println("f=" +f);
		System.out.println("l=" +l);
		System.out.println("result="+result);
	}

}
