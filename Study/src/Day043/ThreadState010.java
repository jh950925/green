package Day043;
/**
 ㅁ 데몬 스레드
 - 강제로 종료
 - 예)가비지 콜렉터, 문서자동저장...
**/
class Todo010 extends Thread {
	String todo;
	public Todo010() { }
	public Todo010(String todo) { this.todo = todo; }

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(todo +" : "+ i);
			try { Thread.sleep((long) (Math.random()*3000)); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}//end for
	}//end run
}
////////////////////////////////////////////////////////////
public class ThreadState010 {
	public static void main(String[] args) {
		System.out.println("===Main Start!");
		Todo010 todo = new Todo010("Java Study");
		todo.setDaemon(true);//메인스레드종료시 종속스레드드 작업이 다 안끝나도 같이 종료
		todo.start();
		try { Thread.sleep(3000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println("===Main End!");
	}	
}
