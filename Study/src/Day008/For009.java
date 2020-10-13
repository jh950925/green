package Day008;

public class For009 {

	public static void main(String[] args) {

		char ch = ' ';
		int a =0;
		for(ch='A';ch<='Z';ch++) {
			System.out.print(ch);
			a++;
			if(a%5==0) {
				System.out.print("\n");
			}
		}
	}

}
