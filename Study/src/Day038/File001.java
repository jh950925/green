package Day038;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

public class File001 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// 1. folder만들기 - file (아까만든 folder안에 넣기) file001번 만들기 get1 2 5
		File folder = new File("D:\\study\\File\\File_"+cal.get(1)+(cal.get(2)+1)+cal.get(5));
		System.out.println(folder.exists());
		if(!folder.exists()) {
			folder.mkdir();
		}
		System.out.println(folder.exists());
		
		// 2. 파일만들기    - 위에 폴더에 write1.txt
		File file = new File("D:\\study\\File\\File_20201118\\" + "write1_"+cal.get(1)+(cal.get(2)+1)+cal.get(5)+".txt");
		Path output = Paths.get("D:\\study\\File\\File_20201118\\" + "write1.txt");
		try {
			BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8);
			writer.write("Apple");
			writer.write("Banana");
			writer.write("Coconut");
			writer.close(); // 무조건 닫아야함
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(file.exists());
		try {
			if(!file.exists()) { file.createNewFile(); }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(file.exists());
	}
}
