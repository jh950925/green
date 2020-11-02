package Day026_Class;

import java.util.Scanner;

public class ClassArr007_dicQuestion {
	
	//단어 맞춰보기
	public void ClassArr007_dicQuestion(ClassArr007_MyDictionary words[]) {

		Scanner scanner = new Scanner(System.in);
		char chk[];

		for (int i = 0; i < words.length; i++) {
			chk = words[i].getWord().toCharArray();
			ClassArr007_MyDictionary.dno_count++;
			words[i].setDno(ClassArr007_MyDictionary.dno_count);

			for (int j = 0; j < words[i].getWord().length(); j++) {
				int random = (int) (Math.random() * (words[i].getWord().length() - 1));
				char mix = chk[j];
				chk[j] = chk[random];
				chk[random] = mix;
			}
			System.out.print("Q" + words[i].getDno() + ". ");
			for (int j = 0; j < chk.length; j++) {
				System.out.print(chk[j]);
			}
			System.out.print(" 의 정답을 입력하세요 > ");

			String word = scanner.nextLine();
			if (words[i].getWord().equals(word)) {
				System.out.println("맞았습니다.");
				words[i].setUserAnswer('O');
				ClassArr007_MyDictionary.trueAnswer++;
			} else {
				System.out.println("틀렸습니다.");
				words[i].setUserAnswer('X');
			}
		}
		scanner.close();
	}
	
	//생성자
	public ClassArr007_dicQuestion() {
		super();
	}
}
