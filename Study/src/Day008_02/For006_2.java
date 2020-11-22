package Day008_02;

public class For006_2 {

	public static void main(String[] args) {
		
		int a = 0, sum = 0;
		System.out.println("1~10까지 3의 배수의 합을 출력하시오\n");
		
		for(a=1;a<=10;a++) {
			switch(a%3) {
			case 0:
				sum += a;
			}
			
		}
		System.out.print(sum);

	}

}
