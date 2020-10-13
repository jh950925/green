package Day008;

public class For006 {

	public static void main(String[] args) {

		int a = 0, sum = 0;
		System.out.println("1~10까지 3의 배수의 합을 출력하시오\n");
		
		for(a=1;a<=10;a++) {
			if(a%3==0) {
				sum += a;
				System.out.print(a);
				if(a<9){				
					System.out.print("+");	
				}else {
					System.out.print("=");
				}
			}
		
		}
		System.out.print(sum);
	}

}
