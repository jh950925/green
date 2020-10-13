package Day007;
import java.util.Scanner;

public class Switch002 {

	public static void main(String[] args) {

		int num = 0; String result = " ";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 달을 입력해 주세요");
		num = scanner.nextInt();
		
		switch(num) {
		case 3 : result = "봄이닫"; break;
		case 6 : result = "여름이다"; break;
		case 9 : result = "가을이다"; break;
		case 12 : result = "겨울이다"; break;
		}
		System.out.println(result);
	}

}
