package Day012;

public class Arr005 {

	public static void main(String[] args) {

		int []arr = new int[3];	// new(공간 빌려오기) int(정수형 3개) [갯수]
		//arr[0] arr[1] arr[2]
		//ver-1
		int data =0;
		
//		data = data+10; arr[0] = data;
//		data = data+10; arr[1] = data;
//		data = data+10; arr[2] = data;
		
		for(int a=0;a<arr.length;a++) {
			data += 10; 
			arr[a] = data;
		}
		
//		arr[0] =10; arr[1] =20; arr[2] =10;
//		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
