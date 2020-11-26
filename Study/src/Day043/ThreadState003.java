package Day043;

class StateTest003 extends Thread{
	private String todo;
	public StateTest003() {}
	public StateTest003(String todo) { this.todo = todo; }
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + "\t" + this.todo);
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}//end while
	}//end run
}
/////////////////////////////////////////////////////////////////////
public class ThreadState003 {
	public static void main(String[] args) {
		StateTest003 todo1 = new StateTest003("1. 청소");     todo1.start();
		StateTest003 todo2 = new StateTest003("\t2. 빨래");   todo2.start();
		StateTest003 todo3 = new StateTest003("\t\t3. 산책"); todo3.start();
		
		try {
			//1. 3초동안 쉬기
			Thread.sleep(3000);
			//2. 빨래(todo2) 일시정지, 청소(todo1) 일시정지
			todo1.suspend(); //deprecated [일시정지]
			todo2.suspend(); //deprecated [일시정지]
			
			//3. 산책(todo3) 종료 후 청소(todo1) 다시 동작
			Thread.sleep(3000);	
			todo3.stop();		//[강제종료]
			todo1.resume();		//[다시시작]
			todo2.resume();		//[다시시작]
			
			//4. todo1, todo2 강제종료
			todo1.stop(); // [강제종료]
			todo2.stop(); // [강제종료]
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}//end main
}//end class
/*
1. stop(), suspend(), resume() 스레드를 교착상태로 만들기 쉽기 때문에 deprecated 됨.  
2. 교착상태(deadlock) 
	->두 개 이상의 작업이 서로 상대방의 작업이 끝나기 만을 기다리고 있기 떄문에 [결과적으로 아무것도 완료되지 못한느 상태]
3. stop()    : 영구정지
	suspend() : 일지정지
	resume()  : 다시 재생  
*/