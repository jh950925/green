package Day030_Interface;

import java.util.Arrays;
import java.util.Calendar;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
interface Launch{
	int money = 10000;
	void eat();
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Burger implements Launch{
	int price;
	public Burger() { 
		super();  
		this.price=3900;
	}
	@Override
	public void eat() {
		System.out.println("버거냠냠");
	}
	@Override
	public String toString() {
		return "Burger";
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
class KimchiStew implements Launch{
	int price;
	public KimchiStew() { 
		super(); 
		this.price=4000;
	}
	@Override
	public void eat() {
		System.out.println("김치냠냠");
	}
	@Override
	public String toString() {
		return "KimchiStew";
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
class User{
	Launch [] plate;
	int cnt =0;
	int money;
	User(){
		money = Launch.money;
		plate = new Launch[3];
	}

	public void order(Launch food) {
		plate[cnt]=food;
		
		if (money<3900) {
			System.out.println("= 잔액이 부족해 ["+ food +"] 더이상 주문이 불가능합니다.");
		}else {
			cnt++;
			if(food instanceof Burger) {
				money -= ((Burger)food).price;
			}else if(food instanceof KimchiStew){
				money -= ((KimchiStew)food).price;
			}
		}
	}
	
	public void show() {
		Calendar today = Calendar.getInstance();
		System.out.print("주문 : ");
		for(int i=0;i<cnt;i++) {
			System.out.print(plate[i]+"\t");
		}
		System.out.println("\n주문금액 : " + (Launch.money-money));
		System.out.println("잔액 : "+ money);
		System.out.println("주문시간 : " 
							+today.get(1)+"년 "
							+(today.get(2)+1)+"월 "
							+today.get(5)+"일"
							);
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Interface {
	public static void main(String[] args) {
		User launchorder = new User();
		launchorder.order(new Burger()); 		//리턴값 : void | 메서드명 : order | 파라미터 : Launch
		launchorder.order(new KimchiStew());	//리턴값 : void | 메서드명 : order | 파라미터 : Launch
		launchorder.order(new Burger());		//리턴값 : void | 메서드명 : order | 파라미터 : Launch
		launchorder.show();						//리턴값 : void | 메서드명 : show  | 파라미터 : X
	}
}
