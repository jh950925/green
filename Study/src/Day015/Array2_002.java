package Day015;

public class Array2_002 {

	public static void main(String[] args) {

		int [][]dal = {{10,20,30,},{40,50,60,}};
		
		for(int i=0;i<dal.length; i++) {
			for(int j=0;j<dal[i].length; j++) {
				System.out.print(dal[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
