package Day015;

public class Array2_012 {

	public static void main(String[] args) {

		int [][] dal =new int [2][3];
		int data =11;
		
		for(int i=0; i<dal.length;i++) {
			for(int j=0;j<dal[i].length;j++) {
				dal[i][j] = data++;
			}
		}
		
		for(int i=0; i<dal.length; i++) {
			for(int j=0; j<dal[i].length;j++) {
				System.out.print(dal[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
 