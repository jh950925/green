package Day006;

public class Q003 {

	public static void main(String[] args) {
		byte a = 10;	byte b = 20; 
		// a에 10, b에는 20을 넣었는데 오류 안뜨는건 byte는 -128~127범위이기 때문에
		
		byte c = (byte)(a+b);	// 정수형의 기본단위 : int 
		int d = a + b;
		byte e = 10 +20 ;
		//해결방법1) a+b를 byte로 만들기 : add cast to byte
		//해결방법2)change type of 'd' to 'int'
		
		
		char ch = 'A';	ch = (char)(ch + '2');
		//ch + 2 => 67(int)

	}

}
	