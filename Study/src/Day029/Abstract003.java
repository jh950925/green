package Day029;

abstract class Calc {

	public Calc() { }

	abstract double exec(double a, double b);
}

/////////////////////////////////////////////////
class Plus extends Calc {

	@Override
	double exec(double a, double b) {
		double result = 0.0;
		result = a + b;
		return result;
	}
}

/////////////////////////////////////////////////
class Minus extends Calc {

	@Override
	double exec(double a, double b) {
		double result = 0.0;
		result = a - b;
		return result;
	}
}

/////////////////////////////////////////////////
class Multiply extends Calc {

	@Override
	double exec(double a, double b) {
		double result = 0.0;
		result = a * b;
		return result;
	}
}

/////////////////////////////////////////////////
class Divide extends Calc {

	@Override
	double exec(double a, double b) {
		double result = 0.0;
		result = a / b;
		return result;
	}
}

//////////////////////////////////////////////////
public class Abstract003 {
	public static void main(String[] args) {

		//Test001
		//Calc mycalc = new Calc(); : exec에서 {}가 없기 때문에 생성할 수 없다.
		
		//Test002
		int num1 = 10; 
		int num2 = 3;
		Calc mycalc1 = new Plus();
		Calc mycalc2 = new Minus();
		Calc mycalc3 = new Multiply();
		Calc mycalc4 = new Divide();
		System.out.println("더하기 : " + mycalc1.exec(num1, num2));
		System.out.println("뻬 기 : " + mycalc2.exec(num1, num2));
		System.out.println("곱하기 : " + mycalc3.exec(num1, num2));
		System.out.println("나누기 : " + String.format("%.2f", mycalc4.exec(num1, num2)));
	}
}
