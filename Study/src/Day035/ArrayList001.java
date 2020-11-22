package Day035;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayList001 {
	public static void main(String[] args) {
		
		
		// q1)ArrayList를 이용해서 Number 리스트 만들기
		ArrayList arr = new ArrayList();
		// q2)"ONE","TWO","THREE" 데이터 넣기
		arr.add("one"); arr.add("TWO"); arr.add("THREE");
		// q3)inputDialog 이용해서 1,2,3중에 입력해 주세요
		String num = JOptionPane.showInputDialog("1,2,3중에 입력해 주세요");
		// q4)만약 1을 입력하면 ArrayList의 ONE을 알림창에 띄우기
		//	  만약 2을 입력하면 ArrayList의 TWO을 알림창에 띄우기
		//	  만약 3을 입력하면 ArrayList의 THREE을 알림창에 띄우기
		for(int i=0; i<arr.size();i++) {
			if(Integer.parseInt(num) == i+1) {
				JOptionPane.showMessageDialog(null, arr.get(i));
			}
		}
		
	}//end main
}//end class
