package Day035;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayList002 {
	public static void main(String[] args) {
		
		//q1) ArrayList를 이용해서 avengers 만들기
		ArrayList avengers = new ArrayList();
		//q2) String[] 을 이용해서 Iron, Hulk, Captain 데이터 넣기
		String[] avenger = {"Iron","Hulk","Captain"};
		//q3) for 구문을 이용하여 avenger에 q2)의 데이터 넣기
		for(int i=0; i<avenger.length;i++) {
			avengers.add(avenger[i]);
//			System.out.println(avengers.get(i));
		}
		//q4) for 구문을 이용하여 avenger의 데이터 출력 (무한반복)
		for(int i=0; i<avenger.length;i++) {
			System.out.println(avengers.get(i));
		}
		while(true) {
			String name = JOptionPane.showInputDialog("["+avengers+"]"+" 당신의 영웅의 번호 (1,2,3)을 입력해 주세요"+"4번 입력시 종료");
			switch(Integer.parseInt(name)) {
			case 1: JOptionPane.showMessageDialog(null, "부자남자 "+avengers.get(0)); break;
			case 2: JOptionPane.showMessageDialog(null, "초록색 남자 "+avengers.get(1)); break;
			case 3: JOptionPane.showMessageDialog(null, "항상 대장 "+avengers.get(2)); break;
			}
			if(Integer.parseInt(name) == 4) {
				JOptionPane.showMessageDialog(null, "종료합니다.");
				break;
			}
		}
	}
}
