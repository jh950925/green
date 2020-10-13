package Day011;

public class For2011 {

	public static void main(String[] args) {
		System.out.println("===for===");
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			for (char ch2 = 'Z'; ch2 >= ch; ch2--) {
				System.out.print(ch2);
			}
			System.out.println();
		}
		
		System.out.println("===while===");
		
		char ch= 'Z',ch2='Z';
		while(ch>='A'){
			while(ch2 >=ch){
				System.out.print(ch2);
				ch2--;
			}
			ch--;
			ch2 = 'Z';
			System.out.println();
		}
		
		System.out.println("===do while===");
		
		ch='Z'; ch2='Z';
		do {
			do {
				System.out.print(ch2);
				ch2--;
			}while(ch2 >=ch);
			ch--;
			ch2 = 'Z';
			System.out.println();
		}while(ch>='A');
	}

}
