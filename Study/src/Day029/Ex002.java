package Day029;

import java.util.Arrays;

class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	public void ap() {
		System.out.println("사과는 빨갛다");
	}
	@Override
	public String toString() {
		return "Apple";
	}
}
class Banana extends Fruit{
	public void bana() {
		System.out.println("바나나는 노랗다");
	}
	@Override
	public String toString() {
		return "Banana";
	}
}
class Coconut extends Fruit{
	public void coco() {
		System.out.println("코코넛은 코코하다");
	}
	@Override
	public String toString() {
		return "Coconut";
	}
}

public class Ex002 {
	public static void main(String[] args) {
//		System.out.println("ver-1 : Fruit [] fruit 방법을 이용하여"
//				+"new Apple(), new Banana(), new Coconut()를 데이터 셋팅하고 다음과 같이 출력하시오."
//				+"ㅁ출력된 화면 : [Apple, Banana, Coconut]");
		Fruit [] fruit = {
				new Apple()
				,new Banana()
				,new Coconut()
		};
		System.out.println(Arrays.toString(fruit));
		/////////////////////////////////////////////////
//		System.out.println("ver-2 : Fruit [] fruit2 = new Fruit[3]; 방법을 이용하여"
//				+"new Apple(), new Banana(), new Coconut()를 데이터 셋팅하고 다음과 같이 출력하시오."
//				+"ㅁ출력된 화면 : [Apple, Banana, Coconut]");
		Fruit [] fruit2 = new Fruit[3];
		fruit2[0] = new Apple();
		fruit2[1] = new Banana(); 
		fruit2[2] = new Coconut();
		System.out.println(Arrays.toString(fruit2));
		/////////////////////////////////////////////////
//		System.out.println("ver-2 : instanceof를 이용하여 어디서 파생되었는지 출력하시오. 해당 메서드 출력"
//				+"ㅁ출력된 화면 : 사과는 빨갛다.\t\n"
//				+"바나나는 노랗다. \t\n"
//				+"코코넛은 코코하다.\r\n"
//				+"");
		if(fruit2[0] instanceof Apple) { 
			((Apple)fruit2[0]).ap();
		}if(fruit2[1] instanceof Banana){
			((Banana)fruit2[1]).bana();
		}if(fruit2[2] instanceof Coconut){
			((Coconut)fruit2[2]).coco();
		}
	}
}
