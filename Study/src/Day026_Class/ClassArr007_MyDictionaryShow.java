package Day026_Class;

import java.util.Arrays;
import java.util.Scanner;

public class ClassArr007_MyDictionaryShow {
	String iteevnsiol;
	String ptmuocer;
	String oumse;
	String phone;

	// 출력
	public void show(ClassArr007_MyDictionary[] words) {
		answer();
		title();
		for(int i=0; i<words.length;i++) {
			System.out.println(Arrays.deepToString(words));
		}
	}

	// 타이틀
	public void title() {
		System.out.println("========================");
		System.out.println(":::::::::::: DICTIONARY");
		System.out.println("========================");
		System.out.println("NO     ANSWER     WORD");
	}

	// 선
	public void line() {
		System.out.println("------------------------");
	}

	// 스캐너
	public void answer() {
		ClassArr007_MyDictionary A = new ClassArr007_MyDictionary();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Q1. iteevnsiol의 정답을 입력하세요. > ");
		iteevnsiol = scanner.next();
		A.setIteevnsiol(iteevnsiol);
		
		System.out.println("Q2. ptmuocer의 정답을 입력하세요. > ");
		ptmuocer = scanner.next();
		A.setPtmuocer(ptmuocer);
		
		System.out.println("Q3. oumse의 정답을 입력하세요. > ");
		oumse = scanner.next();
		A.setOumse(oumse);
		
		System.out.println("Q4. phone의 정답을 입력하세요. > ");
		phone = scanner.next();
		A.setPhone(phone);
		
		scanner.close();
	}

	// 생성자
	public ClassArr007_MyDictionaryShow() {
		super();
	}
}
