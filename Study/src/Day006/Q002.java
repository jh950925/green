package Day006;

public class Q002 {

	public static void main(String[] args) {
		int x = 2 ;		int y = 5;	 char c = 'A';
		
		System.out.println( y >= 5 || x < 0 && x > 2); 	//우선순위가 &&먼저여서 y >= 5 || false가 나오는데 
													   	//||는 하나만 true여도 treu여서 y =5이므로 true
		
		System.out.println(y += 10 - x++);				//y에 10을 더한후 저장이여서 15가 되고 그 값에 세미콜론 이후에 바꾸는  x++이므로 13
		System.out.println(x+=2);						//위에서 x++로 3이 되었다가 +2를 다시 저장하니 5
		System.out.println(!('A' <= c && c <= 'Z'));	// 'A'와 c는 동일하니 맞고 c와 'Z'는 아스키로 따져도 c('A')가 작기때문에 맞는거라서 true
		System.out.println('C' -c); 					//이항연산자여서 c는 'A'이므로 'C'보다 코드는 모르지만 2칸이 더 작아서 2가 된다
		System.out.println('5' - '0');					//마찬가지로 이항연산자인데 '5'가 '0' 보다 5칸이 더 뒤에 있어서 결국 5
		System.out.println(c+1);						//+1이 있어서 이항연산자가 되고  'A'의 아스키코드는 65이므로 66가 된다
		System.out.println(++c);						//단항연산자이므로 먼저 65에서 1이 올라가고 문자로 표현되어 B
		System.out.println(c++);						//위에서 ++c를 하여서 B가 되었는데 c++는 세미콜론 뒤에 증가하기때문에 아직 위에값과 동일하게 출력되어 B
		System.out.println(c);							//위에서 c++를 하였기때문에 이제 출력은 C가 되어 표현된다.
		
		

	}

}
