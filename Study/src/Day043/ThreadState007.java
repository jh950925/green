package Day043;

/**
 1. 두 개 이상의 Thread를 가동시키면 가능하면 공평하게 실행이 되게끔 스케줄링이 됨.
 2. 만약 특정객체가 먼저 일이 끝나도록 요구 된다면 스레드의 우선순위를 설정
 	=> 반드시 먼저 끝난다라는 보장이 없음
 	
 	setPriority(정수값)
**/

class Todo007 extends Thread{
	String todo;
	public Todo007() {}
	public Todo007(String todo) {
		super();
		this.todo = todo;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(todo + i);
			try { Thread.sleep((long) (Math.random()*3000)); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}

public class ThreadState007 {
	public static void main(String[] args) {
		Todo007 todo1 = new Todo007("\t01"); 
		Todo007 todo2 = new Todo007("\t\t02"); 
		Todo007 todo3 = new Todo007("\t\t\t03"); 
		
		todo1.setPriority(Thread.MAX_PRIORITY); //최대
		todo2.setPriority(Thread.MIN_PRIORITY); //최대
		todo3.setPriority(5);
		System.out.println("setPriority of todo1 : " + todo1.getPriority());
		System.out.println("setPriority of todo2 : " + todo2.getPriority());
		System.out.println("setPriority of todo3 : " + todo3.getPriority());
		
		todo1.start();
		todo2.start();
		todo3.start();
	}
}
