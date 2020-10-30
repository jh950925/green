package Day026_Class;

public class ClassArr004_ScoreProcess {
	
	public void process_avg(ClassArr004_Score[] std) {
		for(int i=0; i<std.length; i++) {
			std[i].setAvg((std[i].getKor() + std[i].getEng() + std[i].getMath()) / 3.0);
		}
	}
	public void process_pass(ClassArr004_Score[] std) {
		for(int i=0; i<std.length; i++) {
			if(std[i].getAvg()>=60) {
				std[i].setPass("합격");
				if(std[i].getKor() < 40 ||std[i].getEng() < 40 ||std[i].getMath() < 40 ) {
					std[i].setPass("과락");
				}
			}else {
				std[i].setPass("불합격");
			}
		}
	}
	public ClassArr004_ScoreProcess() {
		super();
	}
}
