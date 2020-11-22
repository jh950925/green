package Day016;

public class Ex007 {

	public static void main(String[] args) {
		int [] coinUnit = {500,100,50,10};
		int [] coin = {5,5,5,5};	//단위별 동전의 갯수
		int money = 2680; 
		
		System.out.println("moeny = "+money);
		for(int i=0; i<coinUnit.length;i++) {
			coin[i] = money / coinUnit[i];
			System.out.println(coinUnit[i] + " : "+ coin[i] + "개");
			money =  money%coinUnit[i];
		}
		
	}

}
