package Day030;

public class ScoreDto extends Score{
	//멤버변수
	private String jang;
	private String Star;
	private String pass;
	//생성자
	public ScoreDto() { super(); }
	public ScoreDto(String name, int kor, int eng, int math, int total, double avg, String jang, String star, String pass) {
		super(name, kor, eng, math, total, avg);
		this.jang = jang;
		this.Star = star;
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+"ScoreDto [jang=" + jang + ", star=" + Star + ", pass=" + pass + "]";
	}
	public String getJang() { return jang; }
	public void setJang(String jang) { this.jang = jang; }
	public String getStar() { return Star; }
	public void setStar(String star) { this.Star = star; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
	
	public ScoreDto(String name, int kor, int eng, int math) {
		super.setName(name);
		super.setKor(kor);
		super.setEng(eng);
		super.setMath(math);
	}
}
