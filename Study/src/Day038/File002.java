package Day038;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class File002 {
	public static void main(String[] args) {
		File folder = new File("D:\\study\\File\\File_20201118\\File002");
		Scanner scanner = new Scanner(System.in);

		if(folder.exists()) {
			try {
				folder.mkdir();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		Path output = Paths.get("D:\\study\\File\\File_20201118\\File002\\" + "file002.txt");
		try {
			BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8);
			System.out.println("우유이름입력 : ");
			String name = scanner.next();
			System.out.println("우유이름가격 : ");
			int price = scanner.nextInt();
			writer.write(name+" : "+price+"원");
			writer.close(); 
			System.out.println("파일쓰기 성공!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
