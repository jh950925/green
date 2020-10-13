package Day008_02;

public class For010_2 {

	public static void main(String[] args) {
		int a=0,b=0;
		System.out.print("3의 배수이면서 2의 배수 : ");
		for(a=1;a<=30;a++) {
			if(a%3==0 && a%2==0) {
				System.out.print(a+" ");
				switch(a) {
				case 0 :
					b++;
				}
			}
		}
		System.out.println("\n갯수 : "+b);
	}

}
