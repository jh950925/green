package Day039;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Std {
	public static int cnt = 0;
	private int no;
	private String name;
	private int java, jsp, spring, project, sum;
	private double avg;

	public Std(String name, int java, int jsp, int spring, int project, int sum, double avg) {
		super();
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		this.project = project;
		this.sum = sum;
		this.avg = avg;
	}

	public Std() {
		super();
	}

	@Override
	public String toString() {
		return "Std [no=" + no + ", java=" + java + ", jsp=" + jsp + ", spring=" + spring + ", project=" + project
				+ ", sum=" + sum + ", name=" + name + ", avg=" + avg + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getProject() {
		return project;
	}

	public void setProject(int project) {
		this.project = project;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}

public class FIle011 {
	public static void main(String[] args) {

		// 0.dto / ArryaList
		System.out.println("\n\n0. dto / ArrayList");
		Std user = new Std();
		System.out.println(user);
		ArrayList<Std> test = new ArrayList<>();
		test.add(user);
		System.out.println(test);

		// 1.폴더/파일
		System.out.println("\n\n1. 폴더/파일");
		String folderPath = "D:\\study\\File\\File_20201119";
		String filePath = "\\file011.txt";
		Path path = Paths.get(folderPath + filePath);
		ArrayList<Std> list = new ArrayList<>();
		String answer = "y";
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = null;
		BufferedReader reader = null;
		File folder = new File(folderPath);
		File file = new File(folderPath + filePath);

		try {
			if (!folder.exists()) { folder.mkdir(); }
			if (!file.exists()) { file.createNewFile(); }
		} catch (Exception e) { e.printStackTrace(); }

		// 2.사용자에게 입력받아서 + arraylist
		System.out.println("\n\n2. 사용자에게 입력받아서 + arraylist");
		while (answer.trim().toLowerCase().equals("y")) { //'y'라면 다시 입력받기
			String name = "";
			int java, jsp, spring, project, sum = 0;
			double avg = 0;

			System.out.println("이름을 입력해 주세요 : ");
			name = scanner.next();
			System.out.println("JAVA 점수를 입력해 주세요 : ");
			java = scanner.nextInt();
			System.out.println("Jsp 점수를 입력해 주세요 : ");
			jsp = scanner.nextInt();
			System.out.println("Spring 점수를 입력해 주세요 : ");
			spring = scanner.nextInt();
			System.out.println("Project 점수를 입력해 주세요 : ");
			project = scanner.nextInt();

			sum = java + jsp + spring + project;
			avg = sum / 4.0;

			list.add(new Std(name, java, jsp, spring, project, sum, avg));
			System.out.println("다시하시겠습니까? (y/n): ");
			answer = scanner.next();
		}
		System.out.println(list);
		// 3.arraaylist에서 저장된 데이터 txt 파일로 만들어서 보관 - append 계속 추가되게
		System.out.println("\n\n3. arraaylist에서 저장된 데이터 txt 파일로 만들어서 보관 - append 계속 추가되게");
		try {
			writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
			reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			Iterator<Std> iter = list.iterator(); // 1. 리스트 모아오기

			if (reader.readLine() == null) {
				writer.write("■ 2020년 신입사원 평가점수 \r\n" 
						+ "===================================================\n"
						+ "NAME\tJAVA\tJSP\tSPRINT\tPROJECT\tTOT\tAVG\r\n"
						+ "===================================================\r");
			}
			
			while (iter.hasNext()) { // 2. 처리할 대상유무
				Std temp = iter.next(); // 3.대상 뽑아오기
				writer.write(temp.getName() + "\t" + temp.getJava() + "\t" + temp.getJsp() + "\t" + temp.getSpring()
						+ "\t" + temp.getProject() + "\t" + temp.getSum() + "\t" + temp.getAvg());
				writer.newLine();
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 4. txt 파일에 들어가 있는 데이터를 출력
		System.out.println("\n\n4. txt 파일에 들어가 있는 데이터를 출력");
		if(folder.exists() && file.exists()) {
			try {
				while(true) {
					String readLine = reader.readLine();
					if (readLine == null) { break; }
					System.out.println(readLine);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
