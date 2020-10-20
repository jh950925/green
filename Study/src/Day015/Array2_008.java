package Day015;

public class Array2_008 {

	public static void main(String[] args) {
		float [][] f1 = {{1.1f,1.2f,1.3f},{1.4f,1.5f,1.6f}};
		
		for(int i=0;i<f1.length;i++) {
			for(int j=0;j<f1[i].length;j++) {
				System.out.print(f1[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
