package Day008_02;

public class For004_2 {

	public static void main(String[] args) {

		int num=0, sum=0;
						
		System.out.println("for문을 이용하여 1~10까지의 합을 구하시오");
				
		for(num=1;num<=10;num++) {
			sum += num;
			System.out.print(num);
			switch(num) {
			case 10 : 
				System.out.print("=");break;
			default : 
				System.out.print("+");
			}
		}
		System.out.println(sum);
	}

}
