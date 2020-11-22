package Day031_interface;

public class Interface003 {
	public static void main(String[] args) {
		Board board = null;
		board = new BoardInsert(); board.exec();
		board = new BoardDelete(); board.exec();
		board = new BoardSelect(); board.exec();
		board = new BoardUpdate(); board.exec();
	}
}
 