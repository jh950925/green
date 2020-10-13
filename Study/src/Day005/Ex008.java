package Day005;

public class Ex008 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';	//'A'의 문자코드 65
		
		System.out.println(y >=5 || x <0 && x > 2);		//true 우선순위 위에있는 &&먼저 확인했을때 false 인데 
														//||를 확인하면 y는 5이기때문에 둘중 하나만 true라서 true로 출력
		
		System.out.println(y += 10 - x++);				//13 y는 초기값 5에서 10을 더한후 다시 y 저장 - x는 아직 2인상태에서 뺀다 ->13
		System.out.println(x+=2);						//5  위에서 x++를 사용했기 때문에 3인 상태에서 +2를 더한 후 대입하니까 5가 된다.
		
		System.out.println(!('A' <= c && c <= 'Z'));	//false 'A'는 c와 같아서 <=가 맞는표현이고 c가 'Z'보다 작기때문에 둘다 true여서 true인데 
														//!가있기 때문에 false로 표현이 된다.  
		
		System.out.println('C'-c);						//2  'C'는 int보다 작고(이항연산자일때만) 아스키코드가 67이라서 67-65(c='A')이기 
		                                                //때문에 결국 표현은 숫자로 출력되어 답은 2
		
		System.out.println('5'-'0');					//5  위와 동일하게 ' '는 char이기 때문에 아스키 코드로 포현되어 5가 나온다.
														//아스키 코드가 몇인지는 모르지만 순서대로라고 생각했을때 0 1 2 3 4 5 이런식으로 증가하여
														//결국 차이는 5가 나온다.
		
		System.out.println(c+1);						//66 숫자 1을 더해야해서 65에 1을 더한다.
		
		System.out.println(++c);						//B	 단항 연산자는 숫자를 더하는것이 아니라 아스키 코드를 하나 올리는거라서 A에서 하나 올라간 B
		System.out.println(c++);						//B	 위에서 증가하여 'B'로 표현되지만 c++은 세미콜론 이후에 변경하여야 하니 위와 동일하게 B
		System.out.println(c);							//C	 c는 바로 위에서 ++로 ;이 끝난 후 하나가 올라가있는 상태여서 B -> C

	}

}
