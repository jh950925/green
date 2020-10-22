package Day020;

public class Day020_4 {

	public static void main(String[] args) {
		star(2);
		//리턴 : void 
		//파라미터 : int 
	}
	public static void star(int num) {
		String ch= "★";
		for(int i=0; i<num; i++) {
			System.out.print(ch);
		}
	}
}
