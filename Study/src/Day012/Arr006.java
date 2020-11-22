package Day012;

public class Arr006 {

	public static void main(String[] args) {

		float [] arrfloat = new float[5];
		float data = 1.0f; 
		
		for(int i=0; i<arrfloat.length; i++) {
			data += 0.1f;
			arrfloat[i] = data;
		}
		
		for(int j=0; j<arrfloat.length; j++) {
			System.out.print(String.format("%.1f", arrfloat[j])+"\t");
		}
		
	}

}
