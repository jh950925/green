package Day036;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap004 {
	public static void main(String[] args) {
		String id,pass="";
		Scanner scanner = new Scanner(System.in);
		
		HashMap<String,String> map = new HashMap<>();
		map.put("first", "1111");
		map.put("second", "2222");
		map.put("third", "3333");

		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			id = scanner.next();
			System.out.print("pass : ");
			pass = scanner.next();
			
			if(map.containsKey(id) && map.containsValue(pass)) {
				System.out.println("id와 비밀번호가 일치합니다.\n");
				break;
			}else if(map.containsKey(id) && !map.containsValue(pass)){
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.\n");
					continue;
			}else if(!map.containsKey(id) && map.containsValue(pass)){
				System.out.println("입력하신 유저는 존재하지 않습니다. 다시 입력해주세요\n");
				continue;
			}
		}//end while
		scanner.close();
	}//end main
}//end class
