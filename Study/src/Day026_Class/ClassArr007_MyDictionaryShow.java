package Day026_Class;

public class ClassArr007_MyDictionaryShow {
	String iteevnsiol;
	String ptmuocer;
	String oumse;
	String phone;

	// 출력
	public void show(ClassArr007_MyDictionary[] words) {
		title();
		for(int i=0;i<words.length;i++) {
			line();
			System.out.println(words[i].getDno()+"\t"+words[i].getUserAnswer()+"\t"+words[i].getWord());
		}
		line();
		System.out.println("정답 수 : "+ClassArr007_MyDictionary.trueAnswer);
	}

	// 타이틀
	public void title() {
		System.out.println("===========================");
		System.out.println(":::::::::::: DICTIONARY");
		System.out.println("===========================");
		System.out.println("NO     ANSWER     WORD");
	}

	// 선
	public void line() {
		System.out.println("---------------------------");
	}

	// 스캐너
	public void answer() {
		
	}

	// 생성자
}
