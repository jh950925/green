package Bank;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
     
    	Scanner scanner = new Scanner(System.in);
    	String num = "";
    	
    	for(;;) {
    		System.out.print("num : ");
    		num = scanner.next();
    		if(num.indexOf("@") != -1) {
    			System.out.println(num);
    			break;
    		}else {
    			System.out.println();
    			System.out.println("@를 입력해 주세요");
    			System.out.println("========================");
    		}
    	}
    }
}
