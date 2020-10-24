package Day021;

class Score001{
	String name;
	int kor,eng,math,total,aver;
	String p;
	String s;
	String rank="";
	//총점, 평균
	public void process() {
		total = kor+eng+math;
		aver = total/3;
	}
	//합격
	public void pass() {
		if(aver>=60) {
			p = "합격";
		}else {
			p = "불합격";
		}
	}
	//장학생
	public void schola() {
		
		if(aver >=95) {
			s = "장학생";
		}else {
			s=" ";
		}
	}
	//별
	public void star(){
		for(int i=1;i<=(aver/10);i++) {
			rank += "*";
		}
	}
	//출력
	public void show() {
		process();
		pass();
		schola();
		star();
		System.out.println("===========================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("===========================================================================");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+aver+"\t"+p+"\t"+s+"\t"+rank);
	}
}

public class Class006 {
	public static void main(String[] args) {
		Score001 iron = new Score001();
		iron.name="아이언맨"; 
		iron.kor=100;
		iron.eng=100;
		iron.math=100;
		iron.show();
		
		
		Score001 hulk = new Score001();
		hulk.name="헐크"; 
		hulk.kor=20;
		hulk.eng=50;
		hulk.math=30;
		hulk.show();
	}
}
