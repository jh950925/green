package Day031;

public class Test001 {
	public static void main(String[] args) {
//		System.out.println(10/0);
		//q1) 어떤 오류가 발생할까 => java.lang.ArithmeticException
		//q2) try vs throws
		
		//1
		System.out.println("Q1. 오류찾기 - by zero");
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println("Error : my zero");
		//	e.printStackTrace();
		}finally{
			System.out.println("예외가 발생하지 않더라도 무조건 수행하는 부분");
		}
		
		//2
		System.out.println("==========================");
		System.out.println("Q2. 오류찾기 - Index 3 out of bounds for length 3");
		try {
			int [] a = {10,20,30,};
			for(int i=0; i<=3; i++) {
				System.out.println(a[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
		}
		
		//3
		System.out.println("==========================");
		System.out.println("Q3. 오류찾기 - by zero");
		try {
			Integer test2 = null;
			System.out.println(10 / test2);
		}catch(NullPointerException e) {
			System.out.println("Error : test2 is null");
		}
		
	}
}
