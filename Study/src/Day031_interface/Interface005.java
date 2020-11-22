package Day031_interface;

class Unit{
	int x ;
	int y;
	int power;
	public Unit() { super(); }
	public Unit(int x, int y, int power) {
		super();
		this.x = x;
		this.y = y;
		this.power = power;
	}
	@Override
	public String toString() {
		return "Unit [x=" + x + ", y=" + y + ", power=" + power + "]";
	}
}
class Fighter2 implements Fightable{
	@Override public void move(int x, int y) {  }
	@Override public void attack(Unit c) {  }
	
}
/////////////////////////////////////////////////
interface Moveable{
	void move(int x, int y); 
}
interface Attackable{
	void attack (Unit c);
	
}
interface Fightable extends Moveable,Attackable{
	
}
/////////////////////////////////////////////////
public class Interface005 {
	public static void main(String[] args) {
		Fighter2 myc = new Fighter2();
		if(myc instanceof Fightable) {System.out.println("FIghtable1");}
	}
}
