package Day025_02;

public class Score_ver2_ex {

	Score_ver2 a = new Score_ver2();
	
	public Score_ver2_ex() {
		super();
	}

	public double[] exec(int kor, int eng, int math) {
		double[] result = new double[2];
		result[0] = kor + eng + math;
		result[1] = result[0] / 3.0;
		return result;
	}

	public String exec(double aver) {
		String result;
		if (aver >= 60) {
			result = "합격";
		} else {
			result = "불합격";
		}
		return result;
	}
	public String exec_jang(double aver) {
		String result;
		if (aver >= 95) {
			result = "장학생";
		} else {
			result = " ";
		}
		return result;
	}
	public String exec_star(double aver) {
		String result ="";
		double avg =aver;
		for (int i = 1; i <= (avg/10); i++) {
			result += "*";
		}
		return result;
	}
	public void exec_show(Score_ver2 iron) {
		System.out.println("===========================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("===========================================================================");
		System.out.println("" + iron.getName() + "\t" + iron.getKor() + "\t" + iron.getEng() + "\t" + iron.getMath() + "\t" + iron.getTotal()
				+ "\t" + String.format("%.2f", iron.getAver()) + "\t" + iron.getP() + "\t" + iron.getS() + "\t" + iron.getRank() + "\t");
	
	}
}