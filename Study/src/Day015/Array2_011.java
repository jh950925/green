package Day015;

public class Array2_011 {

	public static void main(String[] args) {

		int [][] arr2 = new int[2][3];	//2층 3칸;
		
		//00 01 02
		//10 11 12
		//ver-1
//		arr2[0][0] = 1;
//		arr2[0][1] = 2; 
//		arr2[0][2] = 3;
//
//		arr2[1][0] = 4;
//		arr2[1][1] = 5;
//		arr2[1][2] = 6; // for + length
		
		//ver-2
		int data =1;
//		arr2[0][0] = data++; arr2[0][1] = data++; arr2[0][2] = data++;
//		arr2[1][0] = data++; arr2[1][1] = data++; arr2[2][1] = data++;
		
		//ver-3
//		for(int room=0; room<arr2[0].length;room++){arr2[0][room] = data++;}
//		for(int room=0; room<arr2[1].length;room++){arr2[1][room] = data++;}
		
		for(int floor=0; floor < arr2.length; floor++) {
			for(int room = 0; room< arr2[floor].length; room++) {
				arr2[floor][room] = data++;
			}
		}
		
		for(int floor=0; floor<arr2.length;floor++) {
			for(int room=0; room<arr2[floor].length;room++) {
				System.out.print(arr2[floor][room]+"\t");
			}
			System.out.println();
		}
	}

}
