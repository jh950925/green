package Day041;

import java.util.ArrayList;

class Todo4 extends Thread {
	String todo;
	int num;

	public Todo4() {
	}

	public Todo4(String todo, int num) {
		super();
		this.todo = todo;
		this.num = num;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("\n" + this.num + "-" + this.todo + " - Start\n");
		try {
			Thread.sleep((long) (Math.random() * 100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n" + this.num + "-" + this.todo + " - End\n");
	}// end run
}

public class thread003 {
	static long start = 0, end = 0;

	public static void main(String[] args) {
		ArrayList<Todo4> arr = new ArrayList<>(); 
		System.out.println("============Main -Start");
		start = System.currentTimeMillis();
		for (int i = 0; i < 30; i++) {
			Todo4 todo = new Todo4("ㅁ TODO" + i, i + 1);
			todo.start();
			arr.add(todo);
		}
		for(int i=0; i<arr.size();i++) {
			try { arr.get(i).join(); } 
			catch (Exception e) { e.printStackTrace(); }
		}
		end = System.currentTimeMillis();
		System.out.println("작업시간 : " + (end - start));
		System.out.println("============End -Start");
	}
}
