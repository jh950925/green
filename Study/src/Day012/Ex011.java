package Day012;

public class Ex011 {

	public static void main(String[] args) {

		int num1=1,num2=1;
		int num3=0;
		System.out.print(num1+","+num2+",");
//		System.out.println("\n====");
		for(int i=1;i<7;i++) {
			num3 = num1+num2;
//			System.out.print("["+num1+","+num2+"]");
			System.out.print(num3);
			num1=num2;
//			System.out.print("["+num1+"]");
			num2=num3;
			if(i!=6) {
				System.out.print(",");
			}
//			System.out.print("["+num2+"]");
//			System.out.println();
		}
	}

}
