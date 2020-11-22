package Day029;

class Robot02 {
	public Robot02() {
		super();
	}

	public static void action02() {

	}
}

class DanceRobot02 extends Robot02 {
	void dance02() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot02 extends Robot02 {
	void sing02() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot02 extends Robot02 {
	void draw02() {
		System.out.println("그림을 그립니다.");
	}
}

class Ex_Abstract02 {
	public Ex_Abstract02() {
		super();
	}

	public static void action02(Robot02 a) {
		if (a instanceof DanceRobot02) {
			((DanceRobot02) a).dance02();
		} else if (a instanceof SingRobot02) {
			((SingRobot02) a).sing02();
		} else if (a instanceof DrawRobot02) {
			((DrawRobot02) a).draw02();
		}
	}
}

public class Ex003 {
	public static void main(String[] args) {
		Robot02[] arr = { new DanceRobot02(), new SingRobot02(), new DrawRobot02() };

		for (int i = 0; i < arr.length; i++) {
			Ex_Abstract02.action02(arr[i]);
		}
	}
}
