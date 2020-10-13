package Day004;
import java.util.Scanner;

public class Ex003_total {

	public static void main(String[] args) {
		
		String name = " ";
		int kor, eng, math, total = 0;
		float avg = 0.0f;
		String level =" ";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		name = scanner.next();
		
		System.out.println("국어 입력 : ");
		kor = scanner.nextInt();
		
		System.out.println("영어 입력 : ");
		eng = scanner.nextInt();
		
		System.out.println("수학 입력 : ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0f;
		
		
		System.out.println("=========================================================");
		System.out.println(":\t\t\tGREEN IR SCORE\t\t\t:");
		System.out.println("=========================================================");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 레벨\t");
		System.out.println("=========================================================");
		System.out.println(name+"\t"
							+kor+"\t"
							+eng+"\t"
							+math+"\t"
							+total+"\t"
							+String.format("%.3f", avg)+"\t"
							+"Lv"+Math.round((int)(avg)/10));
	}

}
