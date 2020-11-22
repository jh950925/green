package Day038;

import java.io.File;

public class File000 {
	public static void main(String[] args) {

		// 1. folder 확인
		System.out.println("========================================");
		File folder = new File("D:\\study\\File"); // \(윈도우 경로)
		System.out.println("001. FOLDER EXISTS : " + folder.exists()); //폴더 유무 확인
		System.out.println("========================================");

		// 2. folder 만들기
		if(!folder.exists()) { folder.mkdir(); }
		System.out.println("002. 폴더 만들고 난 후 : " + folder.exists()); //false 존재하면 true
		System.out.println("========================================");
		
		// 3. 파일 확인
		File file = new File("D:\\study\\File" + "file000.txt");
		System.out.println("002. 파일 확인 : " + file.exists()); //false 존재하면 true
		System.out.println("========================================");
		
		// 3. file 만들기
		try {
			if(!file.exists()) { file.createNewFile(); }
			System.out.println("004. 파일 만들고 난 후 확인");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("002. 파일 만들고 난 후 : " + file.exists()); //false 존재하면 true
		System.out.println("========================================");
		
	}//end main
}//end class
