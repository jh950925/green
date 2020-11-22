package Day030;

public class Score {
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + "]";
	}
	public Score() { super(); }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	public int getTotal() { return total; }
	public void setTotal(int total) { this.total = total; }
	public double getAvg() { return avg; }
	public void setAvg(double avg) { this.avg = avg; }
	
	public Score(String name, int kor, int eng, int math, int total, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}

	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
}
