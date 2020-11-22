package Day026;

import Day026_Class.ClassArr004_Score;
import Day026_Class.ClassArr004_ScorePrint;
import Day026_Class.ClassArr004_ScoreProcess;

public class ClassArr004 {
	public static void main(String[] args) {

		ClassArr004_Score[] std = new ClassArr004_Score[3];
		std[0] = new ClassArr004_Score("아이언맨",100,100,100);
		std[1] = new ClassArr004_Score("헐크",90,60,80);
		std[2] = new ClassArr004_Score("블랙팬서",20,60,90);
		
		ClassArr004_ScoreProcess process = new ClassArr004_ScoreProcess();
		process.process_avg(std);
		process.process_pass(std);
		
		ClassArr004_ScorePrint print = new ClassArr004_ScorePrint();
		print.show(std);
	}
}
