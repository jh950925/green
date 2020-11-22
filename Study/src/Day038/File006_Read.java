package Day038;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class File006_Read {
	public static void main(String[] args) {
		String folderPath = "D:\\study\\File\\File_20201118";
		String filePath = "\\write1.txt";
		Path input = Paths.get(folderPath + filePath);
		BufferedReader reader = null;
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		ArrayList<String[]> arr = new ArrayList<>();
		Iterator<String[]> iter = arr.iterator();
		
		if (!folder.exists() || !file.exists()) {
			JOptionPane.showMessageDialog(null, "파일을 찾을 수 없습니다.");
		} else {
			try {
				reader = Files.newBufferedReader(input, StandardCharsets.UTF_8);
				while (true) {
					String readLine = reader.readLine();
					if (readLine == null) { break; }
					String[] farr = readLine.split("\t");
					arr.add(farr);
				}
			} catch (Exception e) { e.printStackTrace(); }
		}
		while(iter.hasNext()) {
			String[] temp = iter.next();
			for(int i=0; i<temp.length;i++) {
				System.out.println(temp[i]);
				System.out.print("\t");
			}
		}
	}
}
