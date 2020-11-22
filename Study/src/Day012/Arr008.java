package Day012;


public class Arr008 {

	public static void main(String[] args){

		String [] name = new String[3];
		String [] a = {"아이언맨","헐크","캡틴"};
		
		
		for(int i=0; i<name.length; i++) {
			name[i] = a[i];
		}
		
		for(int j=0; j<name.length; j++) {
			System.out.print(name[j]+"\t");
		}
		
	}

}
