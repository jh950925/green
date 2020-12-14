package Day051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*

 [유저] -> 요청(request)
 					 <-응답(response) [서버]
 
 */

public class HttpProtocol001_request_response {
	public static void main(String[] args) {
		
		////1. 요청
		try {
			URL url = new URL("https://www.naver.com/"); //import 확인하기
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setDoInput(true); //연결됐으면 true
			conn.setDoOutput(true);
			conn.setUseCaches(false); //캐쉬 쌓이게 하기
			conn.setReadTimeout(10000);
			conn.setRequestMethod("GET");
			
		////2. 응답
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//InputStreamReader는 단어로 getInputStream를 받아주고   BufferedReader는 줄단위로 받아준다.
			//String total =""; 문자열변경시 매번 새로운 주소에 보관이됨.
			//위에 방식을 보안한 것이
			StringBuffer sb = new StringBuffer(); 
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
					sb.append(line);
					System.out.println(System.identityHashCode(sb));
			}
			br.close();
			conn.disconnect();
			System.out.println(sb.toString());
		} catch (MalformedURLException e) { e.printStackTrace(); 
		} catch (IOException e) { e.printStackTrace(); 
		}
		
		
	}
}
