package Day028;
//class Unit{}
//class AirtUnit extends Unit{}
//class GroundUnit extends Unit{}
//class AirCraft extends AirtUnit{}
//class Tank extends GroundUnit{}
public class Polymorphisml8 {
	public static void main(String[] args) {
		System.out.println("class Unit{}");
		System.out.println("class AirtUnit extends Unit{}");
		System.out.println("class GroundUnit extends Unit{}");
		System.out.println("class Tank extends GroundUnit{}");
		System.out.println("class AirCraft extends AirtUnit{}");
		System.out.println("Unit u = new GroundUnit()");
		System.out.println("Tank t = new Tank()");
		System.out.println("AirCraft ac = new AirCraft()");
		
		System.out.println("\n\n");
		
		System.out.println("a. u = (Unit)ac");						// 할머니 	<= 손자 (O)
		System.out.println("b. u = ac");							// 할머니  	<= 손자 (O)
		System.out.println("c. GroundUnit gu = (GroundUnit)u");		// 엄마		<= 할머니(엄마생성자를 부른적 있음) (O) 
		System.out.println("d. AirtUnit au = ac");					// 아빠		<= 손자 (O)
		System.out.println("e. t = (Tank)u");						// 손자  	<= 할머니(손자 생성자를 부른적이 없음) (X)
		System.out.println("f. GroundUnit gu2 = t");				// 엄마      <= 손자 (O)
		System.out.println("정답 : e");
		// e :  
//		Unit u = new GroundUnit();
//		Tank t = new Tank();
//		AirCraft ac = new AirCraft();
//		
//		u = (Unit)ac;
//		u = ac;
//		GroundUnit gu = (GroundUnit)u;
//		AirtUnit au = ac;
//		t = (Tank)u;
//		GroundUnit gu2 = t;
	}
}
