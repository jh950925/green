package Day010_02;

public class For2007_02 {

	public static void main(String[] args) {
		System.out.println("\r\nwhile");      
	      int i=1, j=1;
	      while(i<3) {
	         System.out.println("[" + i + "층]");
	         while(j<=3) {
	            System.out.print(j + "호실\t");
	            j++;
	         }
	         System.out.println();
	         i++;
	         j = 1;


	}

}
}
