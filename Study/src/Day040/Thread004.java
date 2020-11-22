package Day040;
//////////////////////////////////////
class Hello extends Thread{
	@Override
	public void run() { 
		super.run(); 
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep((long) (Math.random() * 3000)); 
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("hello");
		}
	}
}
//////////////////////////////////////
class Cnt10 extends Thread{
	@Override
	public void run() {
		super.run(); 
		for(int i=1; i<11; i++) {
			try {
				Thread.sleep((long) (Math.random() * 3000)); 
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.print(i+"\t");
		}
	}
}
//////////////////////////////////////
public class Thread004 {
	public static void main(String[] args) {
		Hello todo1 = new Hello(); todo1.start();
		Cnt10 todo2 = new Cnt10(); todo2.start();
	}
}
//////////////////////////////////////
/*
스레드를 이용해서 두가지 일을 처리하기
	1. class Hello => Hello 10번 출력
	2. class Cnt10 => 1~10까지 출력
		start -> jvm -> thread manager -> run
*/