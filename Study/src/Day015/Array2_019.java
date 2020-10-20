package Day015;

public class Array2_019 {

	public static void main(String[] args) {

		float[][] f1 = new float[2][3];
		float data = 1.0f; 
		
		for(int i=0; i<f1.length; i++) {
			for(int j=0; j<f1[i].length; j++) {
				data += 0.1f;
				f1[i][j] = data;
			}
			data = 1.0f;
			data += 1.0f;
		}
		
		for(int i=0; i<f1.length;i++) {
			for(int j=0; j<f1[i].length;j++) {
				System.out.print(String.format("%.1f", f1[i][j])+"\t");
			}
			System.out.println();
		}

	}

}
