package Day040;

//////////////////////////////////////
class GuguDan extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
				try {
					Thread.sleep((long) (Math.random() * 200));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}//end for(j)
			System.out.println();
		}//end for(i)

	}
}
//////////////////////////////////////
	class Sum100 extends Thread {
		@Override
		public void run() {
			int sum = 0;
			super.run();
			for (int i = 1; i < 101; i++) {
				sum += i;
				try {
					Thread.sleep((long) (Math.random() * 100));
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(sum + "\t");
			}
		}
	}

//////////////////////////////////////
public class Thread003 {
	public static void main(String[] args) {
		GuguDan todo1 = new GuguDan(); todo1.start();
		Sum100 todo2 = new Sum100(); todo2.start();
	}
}
//////////////////////////////////////
/*
 * 스레드를 이용해서 두가지 일을 처리하기 1. class GuguDan => 2~9단까지 출력 2. class Sum100 =>
 * 1~100까지의 합 start -> jvm -> thread manager -> run
 */