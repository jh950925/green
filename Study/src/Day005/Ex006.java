package Day005;

public class Ex006 {

	public static void main(String[] args) {
		
		double year = 2019;
		
		String result;
		
		result = ((year%4==0 && year%100 !=0) || year%400 ==0)? "윤년" : "평년";
		
		System.out.println("2019년도는 윤년입니까? : " + result);

	}

}
