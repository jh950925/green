package Day013;

public class Day013_4 {

	public static void main(String[] args) {

		for(char i = 'A'; i <= 'D'; i++){
			for(char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
