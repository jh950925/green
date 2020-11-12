package Day032_Inner;

public class Outer004 {
	int value = 10;
	class Inner{
		int value = 20;
		
		void mehthod11() {
			int value = 30;
			for(int i=value; i>0; i-=10) {
				System.out.println(i);
			}
		}
	}
}
