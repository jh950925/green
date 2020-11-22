package Day015;

public class Array2_004 {

	public static void main(String[] args) {
		int [][]da2 = {{101,10,103,},{201,202,203,}};
		
		for(int i=0;i<da2.length; i++) {
			for(int j=0;j<da2[i].length; j++) {
				System.out.print(da2[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
