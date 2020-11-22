package Day021;


public class MethodApi001 {

	public static void main(String[] args) {

		System.out.println("001. Math");
		//필수 : 절대값, 큰수, 작은수, 랜덤
		//Math.random() - Math 마우스 올리기 / f2 / 지구본 모양버튼 클림 => api로 넘어감
		
		System.out.println(Math.random());
		//duble java.long.Math.random() : return값 / 메서드이름 / () 파라미터
		System.out.println(Math.PI);
		// SF (static / final)
		System.out.println(Math.abs(-10));	 //int java.long.Math.abs(int a)
		System.out.println(Math.abs(-2.1));  //절대값 구하기
		System.out.println(Math.max(10,2));	 //최대값
		System.out.println(Math.min(10,2));	 //최소값
		System.out.println();
		//Q1) int ma=10, mb = 20, mc = 30; Math.max를 이용해서 제일 큰 수 찾기
		int ma=10, mb = 20, mc = 30, num=0;
		num = Math.max(ma, mb);
		num = Math.max(num, mc);
		System.out.println(num);
		System.out.println();
		//Q1) 다음의 결과를 찍어보고 어떤의미인지 적으시오
		System.out.println(Math.round(1.5f)); //반올림
		System.out.println(Math.ceil(1.1f));  //올림
		System.out.println(Math.ceil(1.9f));  //올림
		System.out.println(Math.floor(1.1f)); //내림
		System.out.println(Math.floor(1.9f)); //내림
		System.out.println();
		//Q3) 1~45까지의 숫자 랜덤하게 나오게 만들기 (Math.round)
		System.out.println((int)(Math.random()*45)+1);
		
		
		
	}
}
