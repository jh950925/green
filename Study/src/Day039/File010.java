package Day039;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class StdInfo {
	private int no;
	private int java, jsp, spring, project, sum;
	private String name;
	private double avg;
	public StdInfo(String name, int a, int b, int c, int d) { 
		super(); 
		this.java = a;
		this.jsp = b;
		this.spring = c;
		this.project = d;
		this.name = name;
	}
	public StdInfo(String name, int sum, int project, int spring, int jsp, int java, int no, double avg) {
		super();
		this.no = no;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		this.project = project;
		this.sum = sum;
		this.name = name;
		this.avg = avg;
	}
	public StdInfo() {
		// TODO Auto-generated constructor stub
	}
	public int getNo() { return no; }  public void setNo(int no) { this.no = no; }
	public int getJava() { return java; }  public void setJava(int java) { this.java = java; }
	public int getJsp() { return jsp; }  public void setJsp(int jsp) { this.jsp = jsp; }
	public int getSpring() { return spring; }  public void setSpring(int spring) { this.spring = spring; }
	public int getProject() { return project; }  public void setProject(int project) { this.project = project; }
	public int getSum() { return sum; }  public void setSum(int sum) { this.sum = sum; }
	public String getName() { return name; }  public void setName(String name) { this.name = name; }
	public double getAvg() { return avg; }  public void setAvg(double avg) { this.avg = avg; }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class File010 {
	public static void main(String[] args) {
		StdInfo dto = new StdInfo();
		String folder_path = "D:\\study\\File\\File_20201119";
		String file_path = "\\file001.txt";
		File folder = new File(folder_path);
		File file = new File(folder_path + file_path);
		Scanner scanner = new Scanner(System.in);
		ArrayList<StdInfo> list = new ArrayList<>();
		
		
		if (!folder.exists()) {
			folder.mkdir();
		} else if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // 파일 생성
			///////////////////////////////////////////////////////////////////////////////////////
		Path output = Paths.get(folder_path + file_path);
		while (true) {
				System.out.println("이름을 입력해 주세요 : ");
				dto.setName(scanner.next());
				System.out.println("JAVA 점수를 입력해 주세요 : ");
				dto.setJava(scanner.nextInt());
				System.out.println("Jsp 점수를 입력해 주세요 : ");
				dto.setJsp(scanner.nextInt());
				System.out.println("Spring 점수를 입력해 주세요 : ");
				dto.setSpring(scanner.nextInt());
				System.out.println("Project 점수를 입력해 주세요 : ");
				dto.setProject(scanner.nextInt());
				System.out.print("신입사원을 계속 추가하시겠습니까?(y/n) > "); String answer = scanner.next();
				list.add(new StdInfo(dto.getName(),dto.getJava(),dto.getJsp(),dto.getSpring(),dto.getProject()));
			    if(answer.trim().toLowerCase().equals("n")) {break;}
		}
		try {
			BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8,StandardOpenOption.APPEND);
			BufferedWriter writer2 = Files.newBufferedWriter(output, StandardCharsets.UTF_8,StandardOpenOption.APPEND);
			BufferedReader reader = Files.newBufferedReader(output, StandardCharsets.UTF_8);
			
			Iterator<StdInfo> iter = list.iterator();
			writer.write("=================================================="+
		               "\nNAME\tJAVA\tJSP\tSPRINT\tPROJECT\tTOT\tAVG\n");
			while(iter.hasNext()) {
				StdInfo temp = iter.next();
				temp.setSum(temp.getJava() + temp.getJsp() + temp.getSpring() + temp.getProject());
				temp.setAvg(temp.getSum() / 4);
				writer.write(""+temp.getName() +"\t"+ temp.getJava() +"\t"+ temp.getJsp() +"\t"+ temp.getSpring() +"\t"+ temp.getProject()
				+"\t"+ temp.getSum() +"\t"+ temp.getAvg());
				writer2.newLine();
			}
			writer.close();
			writer2.close();
			System.out.println("파일쓰기 성공!");
			try {
				while(true) {
					String readLine = reader.readLine();
					if (readLine == null) { break; }
					System.out.println(readLine);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
