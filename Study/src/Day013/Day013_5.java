package Day013;

public class Day013_5 {

	public static void main(String[] args) {

		int [] arr = new int[3];
		int data = 0;
		
		for(int i=0;i<arr.length;i++) {
			data += 10; 
			arr[i] = data;
		}
		
		for(int j=0; j<arr.length;j++) {
			System.out.print(arr[j]+"\t");
		}
	}

}
