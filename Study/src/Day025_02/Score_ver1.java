package Day025_02;

public class Score_ver1 {
	// 멤버변수
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double aver;
	private String p;
	private String s;
	private String rank;

	// 멤버함수
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// 총점, 평균
	public void process() {
		this.total = this.kor + this.eng + this.math;
		this.aver = this.total / 3.0;
	}

	// 합겹
	public void pass() {
		if (aver >= 60) {
			this.p = "합겹";
		} else {
			this.p = "불합격";
		}
	}

	// 장학생
	public void schola() {
		if (aver >= 95) {
			this.s = "장학생";
		}else {
			this.s = "";
		}
	}

	// 별출력
	public void star() {
		for (int i = 1; i <= (this.aver/10); i++) {
			this.rank += "*";
		}
	}

	// 출력
	public void show() {
		this.process();
		this.pass();
		this.schola();
		this.star();
		System.out.println("" + this.name + "\t" + this.kor + "\t" + this.eng + "\t" + this.math + "\t" + this.total
				+ "\t" + String.format("%.2f", this.aver) + "\t" + this.p + "\t" + this.s + "\t" + this.rank + "\t");
	}

	// 생성자
	public Score_ver1() {
		super();
		this.rank="";
	}

	public Score_ver1(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
/*
		

*/