package Day005;

public class Ex003 {

	public static void main(String[] args) {
		
		int a=1;		int b=5;		int c=3;
		int max, min =0;
		
		max = (a > b && a > c) ? a : ((b > c) ? b : c);
		min = (a < b && a < c) ? a : ((b < c) ? b : c);
		
		System.out.println("최대 : " + max);
		
		System.out.println("최소 : " + min);

		
	}

}


