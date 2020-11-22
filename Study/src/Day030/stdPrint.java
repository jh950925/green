package Day030;

public class stdPrint extends Print{
	Score s = new Score();
	@Override
	void show(ScoreDto std) {
		System.out.println("=======================================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("=======================================================================");
		System.out.println(std.getName()+"\t"+std.getKor()+"\t"+std.getEng()+"\t"+std.getMath()+"\t"+String.format("%.2f", std.getAvg())+"\t"+std.getPass()+"\t"+std.getJang()+"\t"+std.getStar());
	}

	@Override
	void show(ScoreDto[] std) {

	}
}
