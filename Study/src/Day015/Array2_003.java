package Day015;

public class Array2_003 {

	public static void main(String[] args) {
		int [][]dal2 = {{100,200,300,},{400,500,600,}};
		
		for(int i=0;i<dal2.length; i++) {
			for(int j=0;j<dal2[i].length; j++) {
				System.out.print(dal2[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
