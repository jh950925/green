package Day026_Class;

public class ClassArr004_Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	private String pass;

	//////////////////////////////////////////////////////////
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
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	//////////////////////////////////////////////////////////////////////
	public ClassArr004_Score() {
		super();
		this.name = "";
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
		this.avg = 0;
		this.pass = "";
	}
	public ClassArr004_Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
