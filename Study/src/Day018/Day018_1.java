package Day018;

import java.util.Scanner;

public class Day018_1 {

	public static void main(String[] args) {
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		for(;;){
			System.out.println("문자를 입력해 주세요");
			ch = scanner.next().charAt(0);
			if(ch =='+'||ch=='-'||ch=='*'||ch=='/'){
					System.out.println("잘 입력했습니다.");
					break;
			}else{
				System.out.println("+,-,*,/중에 입력해 주세요");
			}
		}
		
		while(true) {
			System.out.println("문자를 입력해 주세요");
			ch = scanner.next().charAt(0);
			if(ch =='+'||ch=='-'||ch=='*'||ch=='/'){
				System.out.println("잘 입력했습니다.");
				break;
			}else{
			System.out.println("+,-,*,/중에 입력해 주세요");
			}
		}
		
		do {
			System.out.println("문자를 입력해 주세요");
			ch = scanner.next().charAt(0);
			if(ch =='+'||ch=='-'||ch=='*'||ch=='/'){
				System.out.println("잘 입력했습니다.");
				break;
			}else{
			System.out.println("+,-,*,/중에 입력해 주세요");
			}
		}while(true);
		
		scanner.close();
	}

}
