package Day011_02;

public class For_up_02 {

	public static void main(String[] args) {
		int a;
		for(int i =1;i<4;i++) {
			a = 3*i-1;
			for(int j=1;j<4;j++) {
				if((a+2)==10) {
					System.out.print(a+"*"+j+"="+a*j+"\t");
					System.out.print((a+1)+"*"+j+"="+(a+1)*j+"\t");
					System.out.println();
				}else {
					System.out.print(a+"*"+j+"="+a*j+"\t");
					System.out.print((a+1)+"*"+j+"="+(a+1)*j+"\t");
					System.out.print((a+2)+"*"+j+"="+(a+2)*j+"\t");
					System.out.println();
				}
			}
			System.out.println();
		}
	}

}
