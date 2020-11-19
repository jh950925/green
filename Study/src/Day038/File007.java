package Day038;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class File007 {
	public static void main(String[] args) {
		String folderPath = "D:\\study\\File\\File_20201118\\File002";
		String filePath = "\\file002.txt";
		Path input = Paths.get(folderPath + filePath);
		BufferedReader reader = null;
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		
		if (!folder.exists() || !file.exists()) {
			JOptionPane.showMessageDialog(null, "파일을 찾을 수 없습니다.");
		} else {
			try {
				reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);
				while (true) {
					String readLine = reader.readLine();
					if (readLine == null) { break; }
					System.out.println(readLine); 
				}
				reader.close();
			} catch (Exception e) { e.printStackTrace(); }
		}
		
	}//end main
}//end class
