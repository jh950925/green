package Day015;

public class Array2_014 {

	public static void main(String[] args) {
		int [][] dal =new int [2][3];
		int data = 100;
		
		for(int i=0; i<dal.length;i++) {
			for(int j=0;j<dal[i].length;j++) {
				data += 1;
				dal[i][j] = data;
			}
			data = 100;
			data += 100; 
		}  
		
		for(int i=0; i<dal.length; i++) {
			for(int j=0; j<dal[i].length;j++) {
				System.out.print(dal[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
