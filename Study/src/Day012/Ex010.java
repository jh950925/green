package Day012;

public class Ex010 {

	public static void main(String[] args) {
		int num = 12345;
		int sum=0;
		
		for(int i=num;i>=1;i/=10) {
			sum+=i%10;
		}
		
//		+,= 가지고 표현
		for(int j=1; j<=5; j++) {
			System.out.print(j);
			if(j==5) {
				System.out.print("=");
			}else {
				System.out.print("+");
			}
		}
		System.out.println(sum);
		

	}

}
