package Day009;

public class Repeat003 {

	public static void main(String[] args) {
		
		int num1=0,i=0;
		for(i=1;i<=10;i++) {
			if(i%3==0) {
				num1++;
			}
		}
		System.out.println("1~10까지의 3의 배수는 : "+num1 + " => {for}");
		
		System.out.println();
		
		while(i<=10) {
			if(i%3==0) {
				num1++;
			}
		}
		System.out.println("1~10까지의 3의 배수는 : "+num1 + " => {while}");
		
		System.out.println();
		
		do {
			if(i%3==0) {
				num1++;
			}
		}while(i<=10);
		System.out.println("1~10까지의 3의 배수는 : "+num1 + " => {do while}");
		
		
	}

}
