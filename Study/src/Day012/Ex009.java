package Day012;

public class Ex009 {

	public static void main(String[] args) {
		
//		hint1)
//		str에서 '1' 문자 뽑기 - str.charAt(0);
//		'1'-'0'
		String str = "12345";
		
		for(int i=0; i<=4;i++) {
			
			System.out.print(str.charAt(i));
			if(i==5) {
				System.out.print("=");
			}else {
				System.out.print("+");
			}
		}
		int sum=0;
		for(char j = 0; j <= 4; j++) {
			sum +=str.charAt(j)-'0';
		}
		
		System.out.println(sum);
	}

}
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		
//		System.out.print(a+"+"+b+"+"+c+"+"+d+"+"+e+"=");
//		System.out.println((a-'0')
//						   +(b-'0')
//						   +(c-'0')
//						   +(d-'0')
//						   +(e-'0'));
//		System.out.println("=========================");
