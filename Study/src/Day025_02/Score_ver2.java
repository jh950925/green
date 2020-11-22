package Day025_02;

public class Score_ver2 {
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
	@Override
	public String toString() {
		return "Score_ver2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", aver=" + aver + ", p=" + p + ", s=" + s + ", rank=" + rank + "]";
	}

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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAver() {
		return aver;
	}

	public void setAver(double aver) {
		this.aver = aver;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	////////////
	// 생성자
	public Score_ver2() {
		name = "";
		p = "";
		s = "";
		rank = "";
		kor = eng = math = total = 0;
		aver = 0;
	}

	public Score_ver2(String name, int kor, int eng, int math, int total, double aver, String p, String s,
			String rank) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total=total;
		this.aver=aver;
		this.p=p;
		this.s=s;
		this.rank = rank;
	}

	public Score_ver2(String name, int kor, int eng, int math) {
		this();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
