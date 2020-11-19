package Day038;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class MilkDtoF1{
	public static int cnt = 0;
	private int mno;
	private String mname;
	private int mprice;
	public MilkDtoF1() { super(); }
	public MilkDtoF1(int mno, String mname, int mprice) {
		super();
		this.mno = ++cnt;	
		this.mname = mname;
		this.mprice = mprice;
	}
	public static int getCnt() { return cnt; } public static void setCnt(int cnt) { MilkDtoF1.cnt = cnt; }
	public int getMno() { return mno; }
	public void setMno(int mno) { this.mno = mno; }
	public String getMname() { return mname; }
	public void setMname(String mname) { this.mname = mname; }
	public int getMprice() { return mprice; }
	public void setMprice(int mprice) { this.mprice = mprice; }
}

public class File003 {
	public static void main(String[] args) {
		MilkDtoF1 dto = new MilkDtoF1();
		String folder_name = "D:\\study\\File\\File_20201118\\File003\\";
		String file_name = "file003.txt";
		char ch =' ';
		Scanner scanner = new Scanner(System.in);
		ArrayList<MilkDtoF1> arr = new ArrayList<>();
		
		File folder = new File(folder_name);
		
		if(!folder.exists()) {
			try {
				folder.mkdir();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		while(true) {
			try {
				Path output = Paths.get(folder_name+file_name);
				BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8);
				System.out.print("우유이름 입력 : ");
				String name = scanner.next();
				dto.setMname(name);
				System.out.print("우유가격 입력 : ");
				int price = scanner.nextInt();
				
				dto.setMprice(price);
				arr.add(new MilkDtoF1(dto.getMno(), name, price));
//				System.out.println("===========================");
//				System.out.println("NO\tNAME\tPRICE");
//				System.out.println("===========================");
				//////////////////////////////////////////////////
				writer.write("===========================\nNO\tNAME\tPRICE\n===========================\n");
				for(int i=0; i<arr.size(); i++) {
					writer.write(""+arr.get(i).getMno()+"\t"
									+arr.get(i).getMname()+"\t"
									+arr.get(i).getMprice()+"\t\n");
				}
				writer.close();
				//////////////////////////////////////////////////
				System.out.print("입력이 끝났습니까? (y/n) : ");
				ch = scanner.next().charAt(0);
				if(ch == 'N' | ch == 'n') {
					continue;
				}else if(ch == 'y' || ch =='Y') {
					break;
				}//else if
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		scanner.close();
	}
}
