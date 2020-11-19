package Day038;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class ScoreDto{
	private String name; private String hap; private String jang; private String star;
	private int kor; private int eng; private int mat; private double avg;
	public ScoreDto() { super(); }
	public ScoreDto(String name, String hap, String jang, String star, int kor, int eng, int mat, double avg) {
		super();
		this.name = name;
		this.hap = hap;
		this.jang = jang;
		this.star = star;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.avg = avg;
	}
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public String getHap() { return hap; } public void setHap(String hap) { this.hap = hap; }
	public String getJang() { return jang; } public void setJang(String jang) { this.jang = jang; }
	public String getStar() { return star; } public void setStar(String star) { this.star = star; }
	public int getKor() { return kor; } public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; } public void setEng(int eng) { this.eng = eng; }
	public int getMat() { return mat; } public void setMat(int mat) { this.mat = mat; }
	public double getAvg() { return avg; } public void setAvg(double avg) { this.avg = avg; }
}

public class File005 {
	public static void main(String[] args) {
		/////////////////////////////////////////////////////////
		ScoreDto dto = new ScoreDto();
		String folder_name = "D:\\study\\File\\File_20201118\\File005\\";
		String file_name = "file005.txt";
		Scanner scanner = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		File folder = new File(folder_name);
		File file = new File(file_name);
		//////////////////////////////////////////////////////////
		System.out.println("이름");
		dto.setName(scanner.next());
		System.out.println("국어");
		dto.setKor(scanner.nextInt());
		System.out.println("영어");
		dto.setEng(scanner.nextInt());
		System.out.println("수학");
		dto.setMat(scanner.nextInt());
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("=============================================");
		/////////////////////////////////////////////////////////////
		
		try {
			FileWriter writer = new FileWriter(folder_name+file_name , true);
			BufferedWriter read = new BufferedWriter(writer);
			
		}catch(Exception e) {
			
		}
	}
}
