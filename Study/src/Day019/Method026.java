package Day019;

public class Method026 {

	public static void main(String[] args) {

		int[][] num = {{1,3,5},{2,4,6}};
		print(num);
	}
	public static void print(int [][] num) {
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++){
				num[i][j] +=10;
				System.out.print(num[i][j]+", ");
			}
			System.out.println();
		}
	}
}
 