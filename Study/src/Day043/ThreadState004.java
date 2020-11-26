package Day043;

class StateTest004 implements Runnable {
	private String todo;
	Thread thread;
	boolean suspend, stop, resume;

	public StateTest004() { }
	public StateTest004(String todo) { this.todo = todo; thread = new Thread(this); }

	@Override
	public void run() {
		while (!stop) { //[stop] -> while 빠져나오기
			if(!suspend) { //!true  -> 다시 시작하세요
				System.out.println(Thread.currentThread().getName() + "\t" + this.todo);
				try { Thread.sleep(1000); } 
				catch (InterruptedException e) { System.out.println("InterruptedException 발생!"); }
			}else { //[suspend] -> 일시정지
				Thread.yield(); //다른 스레드에게 양보 (실행시간이 1초 0.5초동안 yield 호출, 0.5초동안 (Wating, Blocked) 다른 스레드에게 양보)
			}
		} // end while
	}// end run

	public void start() { thread.start(); }
	public void suspend() { //### 채우기(1) [일시정지]
		suspend = true; thread.interrupt();
		System.out.println(thread.getName() + "suspend()에 의해 프로그램을 일시정지합니다.");
	}
	public void resume() { //### 채우기(1) [프로그램 다시 시작]
		suspend = false;
		System.out.println(thread.getName() + "resume()에 의해 프로그램을 일시정지합니다.");
	}
	public void stop() {
		stop = true;
		thread.interrupt();
		System.out.println(thread.getName() + "stop()에 의해 프로그램을 종료합니다.");
	}
}

/////////////////////////////////////////////////////////////////////
public class ThreadState004 {
	public static void main(String[] args) {
		StateTest004 todo1 = new StateTest004("1. 청소");
		todo1.start();
		StateTest004 todo2 = new StateTest004("\t2. 빨래");
		todo2.start();
		StateTest004 todo3 = new StateTest004("\t\t3. 산책");
		todo3.start();

		try {
			// 1. 3초동안 쉬기
			Thread.sleep(3000);
			// 2. 빨래(todo2) 일시정지, 청소(todo1) 일시정지
			todo1.suspend(); // deprecated [일시정지]
			todo2.suspend(); // deprecated [일시정지]

			// 3. 산책(todo3) 종료 후 청소(todo1) 다시 동작
			Thread.sleep(3000);
			todo3.stop(); // [강제종료]
			todo1.resume(); // [다시시작]
			todo2.resume(); // [다시시작]

			// 4. todo1, todo2 강제종료
			todo1.stop(); // [강제종료]
			todo2.stop(); // [강제종료]

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}// end main
}// end class
/*
 * 1. stop(), suspend(), resume() 스레드를 교착상태로 만들기 쉽기 때문에 deprecated 됨. 2.
 * 교착상태(deadlock) ->두 개 이상의 작업이 서로 상대방의 작업이 끝나기 만을 기다리고 있기 떄문에 [결과적으로 아무것도 완료되지
 * 못한느 상태] 3. stop() : 영구정지 suspend() : 일지정지 resume() : 다시 재생
 * ==================================================== ㅁ 상태를 표시해주는 콘텐츠를 만들어서
 * 처리하려고 함. 상태 
 * 1. New : 스레드가 생성되고 아직 start()가 호출되지 않은 상태 
 * 2. Runnable : 실행, 실행대기
 * 3. Yield : 양보 - 다시 실행 대기 상태가 되고 다음 스레드가 실행 상태가 됨. 
 * 4. 일시정지 : sleep, join,
 * suspend, wait 
 * 5. 정지상태 벗어나기 : interrupt, resume, notify 
 * 6. 종료(스레드종료) :
 * Terminated ====================================================
 */