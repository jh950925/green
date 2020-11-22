package Day014;

public class Day014_6 {

	public static void main(String[] args) {
		char [] ch = new char[3];
		char data = 'A';
		
		for(int i=0;i<ch.length;i++) {
			ch[i] = data;
			data += 1;
		}
		
		for(int j=0; j<ch.length; j++) {
			System.out.print(ch[j]+"\t");
		}
		
	}

}
