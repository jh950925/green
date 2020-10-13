package Day008_02;

import java.util.Scanner;

public class For012_Ex {

   public static void main(String[] args) {

      int num1=0,num2=0,sum=0;
      boolean first=true;
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("두 수 사이의 합을 구하시오 \r\n");
      System.out.print("숫자 1 입력 : ");
      num1 = scanner.nextInt();
      System.out.print("숫자 2 입력 : ");
      num2 = scanner.nextInt();
      System.out.println("===================");
      
      //작은수에서 큰 수로 for문 이용해서 합
      if(num1<num2) {
         for(int i=num1;i<=num2;i++) {
            if(first) {first=false;}
            else {System.out.print("+");}
            System.out.print(i);
            sum +=i;
         }   
         System.out.println("=" + sum);

         sum = 0;   int backup = num1;       num1 = num2;    num2 = backup;
         first=true;
         for(int j=num1;j>=num2;j--) {
            if(first) {first=false;}
            else {System.out.print("+");}
            System.out.print(j);
            sum +=j;
         }   
         System.out.println("=" + sum);
      }else {
         for(int i=num1;i>=num2;i--) {
            if(first) {first=false;}
            else {System.out.print("+");}
            System.out.print(i);
            sum +=i;
         }   
         System.out.println("=" + sum);
         sum = 0;   int backup = num1;       num1 = num2;    num2 = backup;
         first=true;
         for(int i=num1;i<=num2;i++) {
            if(first) {first=false;}
            else {System.out.print("+");}
            System.out.print(i);
            sum +=i;
         }   
         System.out.println("=" + sum);
      }
      
      scanner.close();
      
   }

}