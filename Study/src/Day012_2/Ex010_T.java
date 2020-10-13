package Day012_2;

public class Ex010_T {

	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;
		int temp = num;
		
		/*
		//ver-2
		temp = 12345%10;//5추출하기
		sum += temp;//sum에 더하
		sum = 12345/10;//1234로 만들기
		
		temp = 1234%10;//4 추출하기
		sum += temp;//sum에 더하기
		sum = 1234/10;//123로 만들기
		
		temp = 123%10;//3 추출하기
		sum += temp;//sum에 더하기
		sum = 123/10;//12로 만들기
		*/
		
		for(int i=0; i<5; i++){
			temp = num%10;//5추출하기
			sum += temp;//sum에 더하
			num = num/10;//1234로 만들기
		}
		System.out.println(sum);
	}

}
