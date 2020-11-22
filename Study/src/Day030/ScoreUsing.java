package Day030;

public class ScoreUsing {
	ScoreDto user;
	Process process;
	Print print;
	
	@Override
	public String toString() {
		return "ScoreUsing [user=" + user + ", process=" + process + ", print=" + print + "]";
	}
	
	public ScoreUsing(String name, int kor, int eng, int math) {
		this.user = new ScoreDto();
		this.user.setName(name);
		this.user.setKor(kor);
		this.user.setEng(eng);
		this.user.setMath(math);
	}
	void exec1() {
		int total = 0; double avg = 0.0;
		String jang =""; String pass = ""; String star="";
		this.process = new Total();  
		total  = (int)this.process.exec(this.user.getKor(), this.user.getEng(), this.user.getMath());
		this.user.setTotal(total);

		this.process = new Avg();  
		avg    = (double)this.process.exec(this.user.getTotal());
		this.user.setAvg(avg);

		this.process = new Jang();  
		jang   = (String)this.process.exec(this.user.getAvg());
		this.user.setJang(jang);
		
		this.process = new Pass();  
		pass   = (String)this.process.exec(this.user.getAvg());
		this.user.setPass(pass);
	
		this.process = new Star();  
		star   = (String)this.process.exec(this.user.getAvg());
		this.user.setStar(star);
	}
	
	void exec2() {
		this.print = new stdPrint();
		this.print.show(this.user);
	}
}
