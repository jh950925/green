package Day038;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class File009 {
	public static void main(String[] args) {
		MilkDtoF1 dto = new MilkDtoF1();
		String folderPath = "D:\\study\\File\\File_20201118\\File003";
		String filePath = "\\file003.txt";
		Path input = Paths.get(folderPath + filePath);
		BufferedReader reader = null;
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		ArrayList<String[]> arr = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		if (!folder.exists() || !file.exists()) {
			JOptionPane.showMessageDialog(null, "파일을 찾을 수 없습니다.");
		} else {
			try {
				reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);
				while (true) {
					String readLine = reader.readLine();
					if (readLine == null) { break; }
					String[] farr = readLine.split("\n");
					for(int i=0; i<farr.length;i++) {
						arr.add(farr);
					}
				}
			} catch (Exception e) { e.printStackTrace(); }
		}
		System.out.println("■ 원하는 우유 번호를 입력하세요 : ");
		int num = scanner.nextInt();
		
		Iterator<String[]> iter = arr.iterator();
		while(iter.hasNext()) {
			String[] temp = iter.next();
//			if(num == dto.getMno()) {
//				for(int i=0; i<temp.length;i++) {
			System.out.println(temp[2]);
//				}
//			}
		}
		
	}//end main
}//end class
