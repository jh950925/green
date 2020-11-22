package Day033;

import java.util.Scanner;
import java.util.Vector;

class CoffeeInfo{
	private String name;
	private int price;
	private int num;
	private int total;
	public static int no_cnt=0;
	private int no;
	
	public CoffeeInfo() { this.no=no_cnt++; }
	public CoffeeInfo(String name, int price, int num) { this.no = ++ no_cnt; this.name = name; this.price = price; this.num = num; mcalc();}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	public int getTotal() { return total; }
	public void setTotal(int total) { this.total = total; }
	public static int getNum_cnt() { return no_cnt; }
	public static void setNum_cnt(int num_cnt) { CoffeeInfo.no_cnt = num_cnt; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	
	public int mcalc() {
		setTotal(this.price*this.num);
		return this.total;
	}
	 
	@Override
	public String toString() {
		return "ORDER"+no+":"+name+"\t"+price+"\t"+num+"\t"+total;
	}
}
//////////////////////////////////////////////////////////////////////////////////
public class Collection005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		Vector coffes = new Vector();
		
		coffes.add(new CoffeeInfo("카페라떼",1800,2));
		coffes.add(new CoffeeInfo("아메리카노",1500,3));
		coffes.add(new CoffeeInfo("에스프레소",2000,1));
		line();
		System.out.println("\tNAME\tPRICE\tNUM\tTOTAL");
		line();
		for(int i=0; i<coffes.size();i++) {
			System.out.println(coffes.get(i));
			line();
		}
		System.out.println("주문정보입니다.");
		System.out.print("주문 이름을 적어주세요 > ");
		name = scanner.next();
		line();
		System.out.println("\tNAME\tPRICE\tNUM\tTOTAL");
		line();
			for(int i=0; i<coffes.size();i++) {
				if(name.equals(coffes.get(i))) {
					System.out.println(coffes.get(i));
				}
			}
//		if(name.equals("카페라떼")) {
//			System.out.println(coffes.get(0));
//		}else if(name.equals("아메리카노")) {
//			System.out.println(coffes.get(1));
//		}else if(name.equals("에스프레소")) {
//			System.out.println(coffes.get(2));
//		}else {
//			System.out.println("메뉴에 있는 커피를 입력해 주세요");
//		}
	}
	public static void line() {
		System.out.println("======================================");
	}
}
