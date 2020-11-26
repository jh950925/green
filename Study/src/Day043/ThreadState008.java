package Day043;
////////////////////////////////////////////////////////////
//synchronized를 붙혀서 실행하면 메서드 하나가 모두 실행된 후에 다음 매서드가 실행됨.
//
class MyCatDay{
	public synchronized void eat() {
		for(int i=0;i<10;i++) {
			System.out.println("★1. 고양이 식사중....");
			try { Thread.sleep((long) (Math.random()*1000)); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println("★1. 고양이 식사완료!!");
	}
	public void sleep() {
		for(int i=0;i<10;i++) {
			synchronized(this) { //2. synchronized 메서드 앞에 붙여서 사용할때 메서드가 넘 ㅜ길다면 일부분만 작업하게 걸 수 있다.
				//꼴 필요한 경우에만 사용하기
				System.out.println("\t★★2. 고양이 수면중....");
			}
			try { Thread.sleep((long) (Math.random()*1000)); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println("\t★★2. 고양이 수면완료!!");
	}
	public synchronized void foo() {
		for(int i=0;i<10;i++) {
			System.out.println("\t\t★★★3. 고양이 배변활동중....");
			try { Thread.sleep((long) (Math.random()*1000)); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println("\t\t★★★3. 고양이 배변활동완료!!");
	}
}
////////////////////////////////////////////////////////////
class Todo008 extends Thread{
	MyCatDay cat; //class 파일도 타입 설정 가능
	int 	 type;
	
	public Todo008() {}
	public Todo008(MyCatDay cat, int type) { this.cat = cat; this.type = type; }
	

	@Override
	public void run() {
		switch(type) {
		case 1: cat.eat(); break;
		case 2: cat.sleep(); break;
		case 3: cat.foo(); break;
		}
	}
}
///////////////////////////////////////////////////////////////////////
public class ThreadState008 {
	public static void main(String[] args) {
		MyCatDay cat = new MyCatDay();
		
		Todo008 cat1 = new Todo008(cat,1);
		Todo008 cat2 = new Todo008(cat,2);
		Todo008 cat3 = new Todo008(cat,3);
		
		cat1.start();
		cat2.start();
		cat3.start();
	}
}
