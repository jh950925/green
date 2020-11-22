package Day005;

public class Ex004 {

	public static void main(String[] args) {
		
		int money = 54320;
		
		
		int a, b, c, d;

		System.out.println("money = " + money + "원");
		
		a = money / 10000;	//5
		money -= a*10000;	//54320-5*10000을 다시 money에 대입하니까 4320남음
		
		b = money / 1000;	//4320 / 1000 =>4
		money -= b*1000;
		
		c = money / 100;
		money -= c*100;
		
		d = money / 10;
		money -= d*10;
		
		System.out.println("만 원 = " + a + "장");
		System.out.println("천 원 = " + b + "장");
		System.out.println("백 원 = " + c + "장");
		System.out.println("십 원 = " + d + "장");
	}

}
