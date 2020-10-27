package Day019;


public class Method030 {

	public static void main(String[] args) {
		line();
		int[] beforeweight = {100,110,120};
		int[] afterweight = return_arr(beforeweight);
		
		show(beforeweight, afterweight);
	} 

	public static int[] return_arr(int[] be) {
		int [] result = new int [3];
		for(int i=0;i<be.length;i++) {
			result[i] = be[i]-50;
		}
		return result;
	} 
 
	public static void show(int[] be, int[] af) {
		System.out.println("BEFORE\tAFTER");
		for(int i=0;i<be.length;i++) {
			System.out.println(be[i] +"\t"+af[i]);
		}
	}

	public static void line() {
		System.out.println("::::검사표");
	}

	
}
