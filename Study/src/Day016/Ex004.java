package Day016;

import java.util.Arrays;

public class Ex004 {

	public static void main(String[] args) {

		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int sum = 0, num=0;
		double avg = 0.0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j]; 
						
			}
		}
		avg = sum/20.0;
		System.out.println(sum);
		System.out.println(String.format("%.2f", avg));
		System.out.println();
		System.out.println(arr.length);
		System.out.println(arr[3].length);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.deepToString(arr));
		
	}

}
