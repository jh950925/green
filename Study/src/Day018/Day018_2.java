package Day018;

public class Day018_2 {

	public static void main(String[] args) {
		int[][] num = new int[2][3];
		int data =100;
		
		for(int i=0;i<num.length;i++) {
			for(int j=0; j<num[i].length;j++) {
				data++;
				num[i][j] = data;
			}
			data=200;
		}
		 
		
		for(int i=0;i<num.length;i++) {
			for(int j=0; j<num[i].length;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
