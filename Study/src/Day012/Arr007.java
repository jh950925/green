package Day012;

public class Arr007 {

	public static void main(String[] args) {

		char [] ch = new char[5];
		char data = 'A';
		
		for(int i=0; i<ch.length; i++) {
			ch[i] = data;
			data += 1;
		}
		
		for(int j=0; j<ch.length; j++) {
			System.out.print(ch[j]+"\t");
		}


		//cd[0]='A' cd[1]='B' cd[2]='C' cd[3]='D' cd[4]='E'
	}

}
