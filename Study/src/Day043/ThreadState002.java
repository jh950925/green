package Day043;

/*
 ㅁ출력화면
	>>>>1. 방해중...
	★
	>>> 2. run중에 방해받았어
	main에서 방해했니? false
	>>>>3. 방해중... 
*/
class StateText002 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("★");
			/*
//			boolean thstate = Thread.interrupted(); //(2) 방해받았는지 상태 확인
			boolean thstate = isInterrupted(); //(2) 방해받았는지 상태 확인
			System.out.println(thstate);
			if(thstate) { System.out.println(">>> 2. run중에 방해받았어"); break; }
			//////Thread.sleep은 스케쥴러에 일정 시간만큼 쉬고(지연후) 다시 등록되기 때문에
			// interrupted, isInterrupted처리가 힘들어짐
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
			*/
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace(); break;}
			//Thread.sleep은 스케쥴러에 일정 시간만큼 쉬고(지연후) 다시 등록됨.
			//[1초쉬고 | ★ | 1초 쉬고 | ★ | 1초 쉬고 | ★ ]
		}
	}//end run
}//end class

public class ThreadState002 {
	public static void main(String[] args) {
		StateText002 test = new StateText002(); test.start();
		
		try { Thread.sleep(1000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println(">>>>1. 방해중...");
		test.interrupt();
		System.out.println("main에서 방해했니? " +test.isInterrupted());
		System.out.println(">>>>3. 방해중...");
	}
}

/**
 
	start() ---> JVM ---> Thread Manager ---> 스케쥴러에 등록 ---> run() 실행 
	
	[ test |   | test(방해 했는지 확인 : Thread.interrupted(),isInterrupted()[runnable할떄 사용 불가]) |   ]
	[	main : interrupt	]
	
**/
