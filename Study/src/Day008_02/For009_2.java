package Day008_02;

public class For009_2 {

	public static void main(String[] args) {

		char ch = ' ';
		int a =0;
		for(ch='A';ch<='Z';ch++) {
			System.out.print(ch);
			a++;
			switch(a%5) {
			case 0 : 
				System.out.println(" ");
			}
		}
	}

}
