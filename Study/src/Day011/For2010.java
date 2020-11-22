package Day011;

public class For2010 {

	public static void main(String[] args) {
		
		System.out.print("===for===");
		for(char ch = 'A'; ch <= 'Z'; ch++){
			for(char ch2 = 'A'; ch2 < ch; ch2++) {
				System.out.print(ch2);
			}
			System.out.println();
		}
		
		System.out.println("===while===");
		
		char ch ='A', ch2= 'A';
		while(ch<='Z') {
			while(ch2<ch) {
				System.out.print(ch2);
				ch2++;
			}
			ch++;
			ch2='A';
			System.out.println();
		}
		System.out.println("===do while===");
		ch='A'; ch2='A';
		do {
			do {
				System.out.print(ch2);
				ch2++;
			}while(ch2<ch);
			ch++;
			ch2='A';
			System.out.println();
		}while(ch<='Z');
	}

}
