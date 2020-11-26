package Day041;

class todo1 extends Thread{
	public void run(){
		super.run(); 
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("hello");
		}
	}
}
///////////////////////////////
class todo2 extends Thread{
	public void run(){
		super.run(); 
		for(int i=1; i<101; i++) {
			try {
				Thread.sleep(100); 
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
///////////////////////////////
public class Day041_1 {
	public static void main(String[] args) {
		todo1 todo1 = new todo1(); todo1.start();
		todo2 todo2 = new todo2(); todo2.start();
	}
}
