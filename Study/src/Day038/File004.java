package Day038;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class File004 {
	public static void main(String[] args) {
		String folder_name = "D:\\study\\File\\File_20201118\\File004\\";
		String file_name = "file004.txt";
		File folder = new File(folder_name);
		ArrayList<String> arr = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		System.out.println("강아지이름은 : ");
		String name =scanner.next();
		arr.add(name);
		try {
			FileWriter writer = new FileWriter(folder_name+file_name , true);
			BufferedWriter re = new BufferedWriter(writer);
			for(int i=0; i<arr.size(); i++) {
				re.write(name+"(가) 추가되었습니다.");
				re.newLine(); //버퍼에 삽입
				re.flush();   //버퍼의 내용을 파일에 쓰기
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
