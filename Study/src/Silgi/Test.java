package Silgi;
/////////////////////////////////////////////////////////
class Score {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private double avg;
	private String pass;

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

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
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

	// 생성자
	public Score() {
		super();
		this.name="";
		this.kor=0;
		this.eng=0;
		this.mat=0;
		this.avg=0.0;
		this.pass="";
	}

	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

}

//////////////////////////////////////////////////
class ScorePricess {
	public void process_avg(Score[] std) {
		for(int i=0; i<std.length; i++) {
			std[i].setAvg((std[i].getKor() + std[i].getEng() + std[i].getMat()) / 3.0);
		}
	}
	public void process_pass(Score[] std) {
		for(int i=0; i<std.length; i++) {
			if(std[i].getAvg()>=60) {
				std[i].setPass("합격");
			}else {
				std[i].setPass("불합격");
			}
		}
	}
	//생성자
	public ScorePricess() {
		super();
	}
}

//////////////////////////////////////////////////
class ScorePrint {
	public void show(Score[] std) {
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부");
		System.out.println("=============================================");
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i].getName() + "\t"  							//이름
							+ std[i].getKor() + "\t" 								//국어
							+ std[i].getEng() + "\t" 								//영어
							+ std[i].getMat() + "\t" 								//수학
							+ String.format("%.2f", std[i].getAvg()) + "\t"			//평균
							+ std[i].getPass());									//합격여부
		}
	}
	public ScorePrint() {
		super();
	}
}

//////////////////////////////////////////////////
public class Test {
	public static void main(String[] args) {

		Score[] std = new Score[3];
		std[0] = new Score("아이언맨", 100, 100, 100);
		std[1] = new Score("헐크", 90, 60, 80);
		std[2] = new Score("블랙팬서", 20, 60, 90);
		ScorePricess process = new ScorePricess();

		process.process_avg(std);
		process.process_pass(std);
		ScorePrint print = new ScorePrint();
		print.show(std);

	}
}// end Test
