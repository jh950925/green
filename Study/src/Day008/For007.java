package Day008;

public class For007 {

	public static void main(String[] args) {

		int a =0, b=0;
		
		for (a=1; a<=2020; a++){
			if(a%4==0 && a%100!=0 || a%400==0){
				b++;
			}
		}
		System.out.println("윤년의 개수는 " + b + "개 입니다.");
	}

}
