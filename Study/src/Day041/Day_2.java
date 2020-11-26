package Day041;

class Todo3 extends Thread {						//##1
	String todo;
	int num;
	public Todo3() { super(); }
	public Todo3(String todo, int num) {
		super();
		this.todo = todo;
		this.num = num;
	}
	@Override
	public void run() {								//##3.
		System.out.println("\n<"+ this.num + "-" + this.todo +"Start>\n");
		try {
			Thread.sleep((long)(Math.random()*3000));
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n{"+ this.num + "-" + this.todo +"End}\n");
	}
}													//발생하는 문제점은
//////////////////////////////
public class Day_2 {
	public static void main(String[] args) {
		System.out.println("=================Main - Start!");
		
		for(int i=0; i<30; i++) {
			Todo3 todo = new Todo3("ㅁ Todo" +i , i+1);
			todo.start();
		}
		try { Thread.sleep(10000); }
		catch(Exception e) { e.printStackTrace(); }
		//sleep이 존재하지 않으면 각각의 thread가 다 처리되기도 전에 main-END가 끝나버린다.(코드의 전원버튼이 종료)
		//해결방안 1) Thread.sleep
		
		System.out.println("=============Main-End");
	}//end main
}//end class
