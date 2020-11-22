package Day040;

class Todo2 extends Thread{
	// 변수
	int todonum;
	String todo; // 작업내용
	long todotime; // 작업시간

	// 생성자
	public Todo2() {
		super();
	}

	public Todo2(String todo, int todonum) {
		super();
		this.todo = todo;
		this.todonum = todonum;
	}
	public void run() { // 작업 내용 + 걸리는 시간을 랜덤하게 표현 : 처리경로
		System.out.println("\n" + this.todonum + " - " + this.todo + " - " + todotime + "Start\n");
		////////////////////////////////////////////////
		try {
			todotime = (long) (Math.random() * 3000);
			Thread.sleep(todotime); // THread(실행).sleep(시간) 시간만큼 재우기
		} catch (InterruptedException e) {
		}
		////////////////////////////////////////////////
		System.out.println("\n" + this.todonum + " - " + this.todo + " - " + todotime + "End\n");
	}
}

public class Thread002 {
	public static void main(String[] args) {

		Todo2 Todo2 = new Todo2("\t자바복습", 1);
		Todo2.start();
		Todo2 todo2 = new Todo2("\t\t포트폴리오", 2);
		todo2.start();
		Todo2 todo3 = new Todo2("\t\t\tGame", 2);
		todo3.start();

	}// end main
}// end class

/**
  [병렬적]
  
  start()   ====> JVM  ====> Thread manager ====> 스케줄러 등록(extends를 시켰기 때문에 사용 가능) ====> run() 실행
  ㅁ 개발자                                                                                        ㅁ 실행되야하는 내용
  
 **/
