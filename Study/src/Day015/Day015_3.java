package Day015;

public class Day015_3 {

	public static void main(String[] args) {

		for(int i=1; i<4; i++) {
			System.out.print("apple ");
			if(i<3){
				System.out.print(",");
			}
		}
		
		System.out.println();
		int i=1;
		while(i<4) {
			System.out.print("apple ");
			if(i<3){
				System.out.print(",");
			}
			i++;
		}
		
		System.out.println();
		i =1;
		do {
			System.out.print("apple ");
			if(i<3){
				System.out.print(",");
			}
			i++;
		}while(i<4);
	}

}
