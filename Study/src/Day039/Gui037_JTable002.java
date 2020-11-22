package Day039;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Gui038 {
	JFrame frame;
	JTable table;
	Object [] columnNames;
	Object[][] rowData;
	JScrollPane scrollpane;
	
	public Gui038() {
		frame = new JFrame();
		columnNames = new String[] {"no","name","price","desc"};
		rowData = new Object[][] {{1,"white",1000,"우유는 하얗다"},{2,"choco",1200,"초코는 검정다"},{3,"banana",1300,"바나나는 노랗다"}};
		table = new JTable(rowData, columnNames);
		scrollpane = new JScrollPane(table);
	}
	
	public void show() {
		frame.add(scrollpane);
		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui037_JTable002 {
	public static void main(String[] args) {
		new Gui038().show();
	}
}
