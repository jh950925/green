package Day042;


//start() ==> JVM ==>Thread manager ==>스케줄러등록 ==> run() 실행
class Thread2 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) { System.out.print(i); }
		
	}
}

public class ThreadEx002 {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		t1.start();// run은 직렬. start는 병렬 -> run은 일반메서드이고 시스템에 등록이 되지 않는다.
		for(int i=0; i<10; i++) { System.out.print("main"+i); }
		
	}
}
