package Day039;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*  column1	column2
	no		name
	1		red			rowdate1
	2		green		rowdata2
	3		blue		rowdata3
	
 */

class Gui037 {
	JFrame frame;
	JTable table; Object[] columnNames; Object[][] rowData; //
	JScrollPane scpane;

	public Gui037() {
		frame = new JFrame(":::: Table 예제");
		columnNames = new String[] { "No", "NAME" };
		rowData = new Object[][] { { 1, "red" }, { 2, "green" }, { 3, "blue" } };
		table = new JTable(rowData, columnNames);
		scpane = new JScrollPane(table);
	}
	public void show() {
		frame.add(scpane);
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui037_JTabel001 {
	public static void main(String[] args) {
		new Gui037().show();
	}
}
