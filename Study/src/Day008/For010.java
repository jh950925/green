package Day008;

public class For010 {

	public static void main(String[] args) {

		int a=0,b=0;
//		System.out.print("3의 배수이면서 2의 배수 : ");
		for(a=1;a<=30;a++) {
			if(a%3==0 && a%2==0) {
				
				System.out.println(++b+".3의 배수이면서 2의 배수인 숫자 : " +a);
			}
		}
		System.out.println("갯수 : "+b+"개");
	}

}
