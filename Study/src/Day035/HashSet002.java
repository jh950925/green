package Day035;

import java.util.HashSet;
import java.util.Iterator;

class Milk{
	private String mname;
	private int mprice;
	public Milk() {
		super();
	}
	public Milk(String mname, int mprice) {
		super();
		this.mname = mname;
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return mname+"\t"+mprice;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	
}
//////////////////////////////////////////////////////
public class HashSet002 {
	public static void main(String[] args) {
		HashSet<Milk> milk = new HashSet<Milk>();
		milk.add(new Milk("바나나우유",1300));
		milk.add(new Milk("메론맛우유",1800));
		milk.add(new Milk("커피우유",1500));
		milk.add(new Milk("커피우유",1500));
		//개수는
		System.out.println(milk.size());
		//4개
		
		//Iterator 출력
		System.out.println("======================");
		System.out.println("NAME\tPRICE");
		System.out.println("======================");
		Iterator iter = milk.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			System.out.println("======================");
		}
	}
}
