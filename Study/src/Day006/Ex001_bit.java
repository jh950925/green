package Day006;

public class Ex001_bit {
	public static void main(String[] args) {
		
		System.out.println(16 << 3);	//128 16 * 2^3 = 16*8 =>128
		System.out.println(16 >> 3);	//2   16/(2^3) = 16/8 =>2
		
		//1bit => 0,1
		//2bit => (0,1)(0,1)			=> 2^2 =>4 =>00 01	10 11
		//3bit => (0,1)(0,1)(0,1)		=> 2^3 =>8 =>000 001	010 011		100 101 110 111
		
		//8bit => 1byte
		//1   2   4   8   16  32  64  128 256
		//2^0 2^1 2^2 2^3 2^4 2^5 2^6 2^7 2^8
		
		//256 128 65  32  16  8   4   2   1
		//2^8 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		//<<(곱하기)					 (나누기)>>
		//					16>>3
		
		//Q1) 3<<2
		System.out.println(3 <<2);	//12
		//Q2) p91
		int x = 2;
		System.out.println(1+x <<33);//6
		//int는 32까지라서 33은 다시 처음부터 해라라는 표현 int 4byte => 4*8=32
		//3<< (곱하기) 2^1
		//3<<1	3^2 = 6
	}
}
