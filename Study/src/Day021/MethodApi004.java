package Day021;

import java.util.Arrays;
import java.util.Scanner;

public class MethodApi004 {

	public static void main(String[] args) {
		System.out.println("002. String");
		
//		1.문자열의 길이 : length, 문자열 찾기 indexOf,
//		2.문자열일부분 추출 : subString
//		3.바꾸기 : replace
//		패턴에 맞춰 문자열 자르기 : split, 대소문자 변환 toUpperCase, toLowerCase
		
		String str = "Apple,Banan,Coconut";
		System.out.println("1. length - 문자열 길이 : " + str.length());
		//int(리턴값) java.lan.String.lengtg[메서드명]()[파라미터X]
		System.out.println("2. indexOf(찾고자하는 문자열) - 문자열찾기 : " + str.indexOf("apple")); //0
		System.out.println("2. indexOf(찾고자하는 문자열) - 문자열찾기 : " + str.indexOf("banan")); //6
		System.out.println("2. indexOf(찾고자하는 문자열) - 못찾으면 -1리턴 : " + str.indexOf("melon")); //-1 
		System.out.println("2. charAt('찾고자하는 문자번호')" + str.charAt(3));
		//본인한테 맞는 메서드 골라서 사용하기 char cahrAt(int index)
		System.out.println("3.replace('찾아서, 바꾸기')" + str.replace("banan", "melon"));
		System.out.println("4. subString() - 문자열 Apple부분 추출 : " + str.substring(0, 5));
		System.out.println("4. subString() - 문자열 일부분 추출 : " + str.substring(str.indexOf("A"), str.indexOf(",")));
		System.out.println("5. split('기준형') 기준점을 기준으로 문자열을 잘라서 배열로 리턴 - ");
		String[] fruits = str.split(",");
		System.out.println(fruits[0] + "\t" + fruits[1]+ "\t" + fruits[2]);
		System.out.println("6.대문자 : " + str.toUpperCase());
		System.out.println("6.소문자 : " + str.toLowerCase());
		
		//Q1) length - 아이디를 입력받기 / 아이디의 길이가 10자 미만이라면 무한반복으로 다시 입력받게 만들기
//		String id = ""; 
//		Scanner scanner = new Scanner(System.in);
//		for(;;) {
//			System.out.print("아이디를 입력해 주세요 : ");
//			id = scanner.next();
//			if(id.length()>=10) {
//				System.out.println("당신의 아이디는 : " +id);
//				break;
//			}
//			System.out.println("당신의 아이디의 길이는 10이상 이여야 합니다.");
//			System.out.println();
//		}
//		System.out.println();
//		
//		//Q2) indexOf - email입력받기 / @가 없다면 admin@email.com의 형식으로 입력하셔야 합니다 출력
//		String email = "";
//		System.out.println("email를 입력해 주세요 : ");
//		email = scanner.next();
//		if(email.indexOf("@") == -1) {
//			System.out.println("admin@email.com의 형식으로 입력하셔야 합니다");
//		}
//		System.out.println();
//		
//		//Q3) http를 찾아서 https로 바꾸기 / String naver = "http://www.naver.com";
//		String http = "";
//		String str2 = " ";
//		System.out.println("주소를 입력해 주세요 : ");
//		http = scanner.next();
//		if(http.indexOf("hppts") == -1) {
//			str2 = http.replace("http", "https");
//			System.out.println("올바른 주소값은 : "+str2);
//		}
		//Q4) ,를 기준으로 문자열 분리 후 myfile이라는 배열에 담기 - 다움과 같이 출력
		String files = "Png,Jpg,Gif,Txt";
		/*
		 	#1. Png #
		 	#2. Jpg #
		 	#3. Gif #
		 	#4. Txt #
		 */
		String[] myfile = files.split(",");
		for(int i=0;i<4;i++) {
			System.out.println("#"+(i+1)+". "+ myfile[i] + " #");
		}
		
		//Q5) toUpperCase를 이용하여 Jpg, Gif를 대문자로 변환 후 배열에 담기
		for(int i = 0; i<myfile.length;i++) {
			if(myfile[i].equals("Jpg") ||myfile[i].equals("Gif") )
				myfile[i] = myfile[i].toUpperCase();
		}
		System.out.println(""+myfile[1]+"\t"+myfile[2]);
		//Q6) toLowerCase를 이용하여 Png를 소문자로 변환에 담기
		for(int i = 0; i<myfile.length;i++) {
			if(myfile[i].equals("Png"))
				myfile[i] = myfile[i].toLowerCase();
		}
		System.out.println(""+myfile[0]);
		
		String colors = "Red,Green,Blue,Black";
		//Q7)indexOf와 SubString을 이용하여 colors문자열에서 Green이 들어간 컬러를 찾아 문자열 일부분을 추출하시오.
		System.out.println("Green : " + colors.substring(colors.indexOf("G"), colors.indexOf("n")));
		
		
		
		
//		scanner.close();
	}

}
