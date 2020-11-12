package Day031;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exception001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int one = 0;
		//문자를 잘못입력하면 숫자를 입력하셔야 합니다.
		//에러처리해주기
//		System.out.println("ver-1");
//		String abc= "";
//		System.out.println("숫자입력"); one = scanner.nextInt(); //1이 들어오기를 기다림
//		System.out.println("문자입력"); abc = scanner.nextLine();//문자가 들어오기를 기다림
//		System.out.println(""+one+"\t"+abc+"입력했어요");
		
		
//		System.out.println("ver-2");
//		String test1,test2="";
//		System.out.println("문자입력"); test1 = scanner.next(); // next()는 공백무시 하이 샐리 => 하이만 데이터로 들어감
//		System.out.println("문자입력"); test2 = scanner.nextLine();//문자가 들어오기를 기다림
//		System.out.println(test1+"\t"+test2+"===");
		// next nextLine(공백처리 가능 )
		
		 
		while(true) {
			try {
				System.out.println("1을 입력하세요 >> ");
				one = scanner.nextInt(); //입력하기 기다립니다. +(a+enter)
			}catch(Exception e) {
				System.out.println("숫자가 아닌 문자를 입력하면 보통은 exception이 나는데 오류가 아닌 숫자만 입력 가능합니다.");
				//JOptionPane.showMessageDialog(null, "숫자가 아닌 문자를 입력하면 보통은 exception이 나는데 오류가 아닌 숫자만 입력 가능합니다.");
//				scanner = new Scanner(System.in);
				scanner.next(); //Enter가 들어갈 공간을 활성화 시켜준다. 에러는 위에서 .nextInt()가 사용하고 공백은 next()가 사용
			}
			if(one ==1 ) {break;}
		}
		
	}//end main
}//class
