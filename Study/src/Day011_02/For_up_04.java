package Day011_02;

public class For_up_04 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j =1; j <= 3; j++) {
				int dan = 2;
				int kan = (i%3==0)? 3:i%3;
				if(dan==2) {
					System.out.print(dan + "*" + kan + "=" + dan * kan + "\t");
					dan = +3;
				}else {
					System.out.print(dan + "*" + kan + "=" + dan * kan + "\t");
				}
			}
			System.out.println("");
		}

	}

}
