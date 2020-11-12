package Day035;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

public class ArrayList000 {
	public static void main(String[] args) {

//		Vector vec2 = new Vector();		  //add.get.remove.size
		ArrayList vec2 = new ArrayList(); //1)순서가 있다. 2)데이터 중복 허용 add.get.remove.size
		
		vec2.add("피자"); vec2.add(4500); vec2.add(3);
		
		System.out.println("list출력 : "+ vec2);
		System.out.println("size 개수출력 : "+vec2.size());
		System.out.println("4500출력 : "+vec2.get(1));
		System.out.println("for문 이용해서 각각의 요소 출력");
		for(int i=0; i<vec2.size();i++) {
			System.out.println(vec2.get(i)+"\t");
		}
		
		System.out.println("\n\n");
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요."); //return 값확인
		JOptionPane.showMessageDialog(null, name+"님 반갑습니다");
	}//end main
}//end class
