package Day031;

import javax.swing.JOptionPane;

public class Test002 {
	public static void main(String[] args) {
		System.out.println("ver-1");
		try {
			System.out.println(10/0); // ArithmeticException	=> 첫줄에서 에러가 발생할 경우 아래 진행불가
			
			int [] a = {10,20,30};
			for(int i=0; i<=3; i++) { System.out.println(a[i]); } // ArrayIndexOutOfBoundsException
			
			Integer b = null;
			System.out.println(b/10); // NullPointerException
		}catch(ArithmeticException e) {
			System.out.println("error1 : ArithmeticException");
			//JOptionPane.showMessageDialog(null, "error1 : ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "error1 : ArrayIndexOutOfBoundsException");
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "error1 : NullPointerException");
		}finally {
			JOptionPane.showMessageDialog(null, "무조건 처리");
		}
		
		System.out.println("\n\nver-2");
		try {
			System.out.println(10/0); // ArithmeticException	=> 첫줄에서 에러가 발생할 경우 아래 진행불가
			int [] a = {10,20,30};
			for(int i=0; i<=3; i++) { System.out.println(a[i]); } // ArrayIndexOutOfBoundsException
			Integer b = null;
			System.out.println(b/10); // NullPointerException
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Exception!!");
		}
		
	}//end main
}//end class
