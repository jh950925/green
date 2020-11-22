package Day008_02;

public class For005_2 {

	public static void main(String[] args) {

		int a =0, b=0;
		System.out.println("1~10까지 3의 배수 갯수를 출력하시오\n");
		
		for(a=1;a<=10;a++) {
			switch(a%3) {
			case 0 : b++;
			}
		}
		System.out.println("3의 배수는 "+b+"개 입니다.");
	}

}
