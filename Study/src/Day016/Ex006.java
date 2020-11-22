package Day016;

public class Ex006 {

	public static void main(String[] args) {

		int [] coinUnit = {500,100,50,10};
		int money = 2680; 
		int num = 0;
		
		System.out.println("moeny = "+money);
		for(int i=0; i<coinUnit.length;i++) {
			num = money / coinUnit[i];
//			System.out.println("몫 : ("+num+")");
//			System.out.println("배열마다 나뉘는 값 : ("+coinUnit[i]+")");
			System.out.println(coinUnit[i] + " : "+ num + "개");
			money =  money%coinUnit[i];
//			System.out.println("돈 : ("+money+")"); //개수 빼고 남는거
		}
		
//		for(int i=0; i<coinUnit.length;i++) {
//			
//		}
	}

}
