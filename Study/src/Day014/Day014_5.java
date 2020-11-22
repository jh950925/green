package Day014;

public class Day014_5 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		
		int data[] = {1000,2000,3000};
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = data[i];
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}

}
