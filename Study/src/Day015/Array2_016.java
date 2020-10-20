package Day015;

public class Array2_016 {

	public static void main(String[] args) {
		char [][] ch1 = new char[2][3];
		char data = 'A';
		 
		for(int i=0; i<ch1.length;i++) {
			for(int j=0; j<ch1[i].length;j++) {
				ch1[i][j]= data++;
			}
			data = 'B';
		}
		
		for(int i=0; i<ch1.length;i++) {
			for(int j=0; j<ch1[i].length;j++) {
				System.out.print(ch1[i][j]+"\t");
			} 
			System.out.println();
		}
	}

}
 