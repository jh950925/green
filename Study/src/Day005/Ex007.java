package Day005;

public class Ex007 {

	public static void main(String[] args) {
		int a=1, b=1, c=1, d=1, e=1;
		
		a = a+1;	//1)+ 	2)= 	예상되는 결과는 : 2 
		System.out.println("★ 산술 (+) 숫자 1개 증가 : a = a+1 : " + a);
		
		b+=1;		//예상되는 결과는 2
		System.out.println("★ 대입 (+=) 숫자 1개 증가 : b = b+1 : " + b);

		     		//예상되는 결과는 2
		System.out.println("★ 증감(c++) 숫자 1개 늘리기 : " + c++);		//1
		System.out.println("; 빠져 나온 후에 1개를 증가해라 : " + c);	//2

		System.out.println("★ 증감(++d) 숫자 1개 늘리기 : " + ++d);		//처리 2
		System.out.println("; 빠져 나오기 (전)에 1개를 증가해라 " + d);		//2
		
		//독립적으로 사용하시면 문제가 없지만 대입, 계산식에서 주의!
		e++;	System.out.println("1개 증가 : " + e);
		++e;	System.out.println("1개 증가 : " + e);
	}

}
