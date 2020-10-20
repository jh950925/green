package Day015;

public class Array2_007 {

	public static void main(String[] args) {
		char[][] ch1 = {{'A','B','C'},{'a','b','c'}};
		
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch1[i].length;j++) {
				System.out.print(ch1[i][j]+"\t");
			}
			System.out.println();
		}
	
	} 

}
