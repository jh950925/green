package Day040;

class Todo1 {
	// 변수
	int todonum;
	String todo; // 작업내용
	long todotime; // 작업시간

	// 생성자
	public Todo1() {
		super();
	}

	public Todo1(String todo, int todonum) {
		super();
		this.todo = todo;
		this.todonum = todonum;
	}

	public void start() {
		this.run();
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

public class Thread001 {
	public static void main(String[] args) {

		Todo1 todo1 = new Todo1("\t자바복습", 1);
		todo1.start();
		Todo1 todo2 = new Todo1("\t\t포트폴리오", 2);
		todo2.start();
		Todo1 todo3 = new Todo1("\t\t\tGame", 2);
		todo3.start();

	}// end main
}// end class

/**
 * 
 * 1. 프로세스 : 직렬적 직렬적 (위->아래, 왼->오)
 * 
 * 프로세스는 [하나의 루틴프로그램] 처리 경로를 가지고 있음. (1번이 끝나야 2번 처리.)
 * 
 **/