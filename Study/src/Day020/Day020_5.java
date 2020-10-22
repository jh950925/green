package Day020;

public class Day020_5 {

	public static void main(String[] args) {

		System.out.println("장수 돌침대는 별이 : "+ star(5));
		
	}

	public static String star(int A) {
		String ch= "";
		for(int i=0; i<A; i++) {
			ch += "★";
		}
		return A+"개 "+ch;
	}
	
}
