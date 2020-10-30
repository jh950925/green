package Day026_Class;

public class ClassArr007_MyDictionary {
	static int dno_count = 0; //해달번호를 자동으로 카운트 하는 static 변수
	static int trueAnswer = 0;//맞춘 답변개수 카운트하는 static변수
	private int dno; 		//각 해당번호
	private String word;	//단어
	private char userAnswer;//사용자가 맞춘 O X 둘 중 하나 저장
	private String iteevnsiol;
	private String ptmuocer;
	private String oumse;
	private String phone;
	
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

	public String getIteevnsiol() {
		return iteevnsiol;
	}

	public void setIteevnsiol(String iteevnsiol) {
		this.iteevnsiol = iteevnsiol;
	}

	public String getPtmuocer() {
		return ptmuocer;
	}

	public void setPtmuocer(String ptmuocer) {
		this.ptmuocer = ptmuocer;
	}

	public String getOumse() {
		return oumse;
	}

	public void setOumse(String oumse) {
		this.oumse = oumse;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//생성자
	public ClassArr007_MyDictionary() {
		super();
		this.iteevnsiol = "";
		this.ptmuocer = "";
		this.oumse = "";
		this.phone = "";
	}

	public ClassArr007_MyDictionary(String string) {
		
	}
}
