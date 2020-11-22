package Day026_Class;

public class ClassArr007_MyDictionary { 
	static int dno_count = 0;	// 해당 번호를 자동으로 카운트 하는 static 변수
	static int trueAnswer = 0; 	// 맞춘 답변 개수를 카운트하는 static 변수
	private int dno;			// 각 해당 번호
	private String word;		// 단어
	private char userAnswer;	// 사용자가 맞춘 O, X 둘 중 하나 저장
	
	public static int getDno_count() {
		return dno_count;
	}
	public static void setDno_count(int dno_count) {
		ClassArr007_MyDictionary.dno_count = dno_count;
	}
	public static int getTrueAnswer() {
		return trueAnswer;
	}
	public static void setTrueAnswer(int trueAnswer) {
		ClassArr007_MyDictionary.trueAnswer = trueAnswer;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public char getUserAnswer() {
		return userAnswer;
	}
	public void setUserAnswer(char userAnswer) {
		this.userAnswer = userAnswer;
	}
	
	///////////////////////////////////생성자
	public ClassArr007_MyDictionary() {
		super();
	}
	public ClassArr007_MyDictionary(String word) {
		this();
		this.word = word;
	}
}
