package Day029;
class Unit{
	int x,y;
	void move(int x, int y) {  }
	void stop() {  }
	public Unit() { super(); }
	public Unit(int x, int y) { super(); this.x = x; this.y = y; }
}
class Marine {//보병
	void stimPack() {  }//스팀팩을 사용한다.
}
class Tank {//보병
	void ChangeMode() {  }//공격모드를 변환한다.
}
class Dropship {//보병
	void load() {  }//선택된 대상을 태운다.
	void unload() {  }//선택된 대상을 내린다.
}
public class Ex004 {
	public static void main(String[] args) {

	}
}
