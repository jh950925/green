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
import javax.swing.JOptionPane;

public class File008 {
	public static void main(String[] args) {
		String folderPath = "D:\\study\\File\\File_20201118\\File003";
		String filePath = "\\file003.txt";
		Path input = Paths.get(folderPath + filePath);
		BufferedReader reader = null;
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		ArrayList<String[]> arr = new ArrayList<>();
		
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
						System.out.println(Arrays.toString(farr)+"["+i+"]");
						arr.add(farr);
					}
				}
			} catch (Exception e) { e.printStackTrace(); }
		}
		System.out.println();
		/////////////////////////////////////////////////////////
		Iterator<String[]> iter = arr.iterator();
		while(iter.hasNext()) {
			String[] temp = iter.next();
			for(int i=0; i<temp.length;i++) {
				System.out.println(temp[i]);
			}
		}
	}
}
