package Day021;

public class MethodApi005 {

	public static void main(String[] args) {
		String str = "http://www.CodeJohns.co.kr/join/index.html";
		System.out.println("1.문자열 출력 : " + str);
		System.out.println("2.글자 수를 리턴 : " + str.length());
		System.out.println("3.index의 1번째 위치의 글자 : " + str.charAt(1));
		System.out.println("3.index의 1번째 위치의 글자 : " + str.substring(1,2)); //T
		
		int position1 = str.indexOf("/");
		int position2 = str.indexOf("/",position1+1); //2개
		int position3 = str.indexOf("/",position2+1);//3개
		int start = position3+1;
		int end = str.indexOf("/"+ start+1);

		System.out.println("4./가 처음 나타나는 위치 : " + position1);
		
		System.out.println("5.두번째 /가 나타나는 위치 : " + position2);

		int position4 = str.lastIndexOf("/");
		System.out.println("6./의 마지막 위치 : " + position4);
		
		System.out.println("7.폴더이름 join의 문자열 추출 : " + str.substring(str.indexOf("j"), str.indexOf("/i"))); //split 금지
//		System.out.println("7.폴더이름 join의 문자열 추출 : " + str.substring(start, end)); //T
		
		System.out.println("8.마지막 /번째부터 끝까지 : " + str.substring(str.lastIndexOf("/")+1));
		System.out.println("9.대문자로 변환 : " + str.toUpperCase());
		System.out.println("10.소문자로 변환 : " + str.toLowerCase());
		
		int domain_start = str.indexOf("://");   // =>  리턴값 : (:)4가 나옴
		int domain_end = str.indexOf("/", domain_start+3);
		System.out.println("11.도메인 : " + str.substring(domain_start+3,domain_end)); // split금지
	}

}
