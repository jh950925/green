package Day037;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

class MilkDto1{
	@Override
	public String toString() {
		return  mno +"\t"+ mname +"\t"+ mprice;
	}
	private int mno;
	private String mname;
	private int mprice;
	public MilkDto1() { super(); }
	public MilkDto1(int mno, String mname, int mprice) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.mprice = mprice;
	}
	public int getMno() { return mno; }
	public void setMno(int mno) { this.mno = mno; }
	public String getMname() { return mname; }
	public void setMname(String mname) { this.mname = mname; }
	public int getMprice() { return mprice; }
	public void setMprice(int mprice) { this.mprice = mprice; }
}
////////////////////////////////////////////////////////////////////////////////////
class WildPrint<Object> extends MilkDto1{
	private Object object;
	public WildPrint() { super(); }
	public WildPrint(Object object) {
		super();
		this.object = object;
	}
	public Object getobject() { return object; } 
	public void setobject(Object object) { this.object = object; }
	public void show() {
		System.out.println("======================");
		System.out.println("NO\tNAME\tPRICE");
		System.out.println("======================");
//		System.out.println(object);
		
		if(object instanceof ArrayList){
			Iterator<Object> iter = ((ArrayList) object).iterator();
			while(iter.hasNext()) {
				Object temp = iter.next();
				System.out.println(temp);
			}	
		}
		else if(object instanceof HashSet) {
			Iterator<Object> iter = ((HashSet) object).iterator();
			while(iter.hasNext()) {
				Object temp = iter.next();
				System.out.println(temp);
			}
		}
		else if(object instanceof HashMap) {
			Iterator<Entry<Integer,String>> iter = ((HashMap) object).entrySet().iterator();
			while(iter.hasNext()) {
				Entry<Integer, String> temp = iter.next();
				System.out.println(temp);
			}
		}
	}
}
////////////////////////////////////////////////////////////////////////////////////
public class Generics004 {
	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////////
		System.out.println("■ [001] ArrayList");
		ArrayList<MilkDto1> list = new ArrayList<MilkDto1>();
		list.add(new MilkDto1(1,"white",1000));
		list.add(new MilkDto1(2,"choco",1200));
		WildPrint<? extends Object> print = new WildPrint<ArrayList>(list); 
		print.show();
		////////////////////////////////////////////////////////////////////////
		System.out.println("\n\n■ [002] HashSet");
		HashSet<MilkDto1> set = new HashSet<MilkDto1>();
		set.add(new MilkDto1(1,"white",1000));
		set.add(new MilkDto1(2,"choco",1200));
		print = new WildPrint<HashSet>(set); 
		print.show();
		////////////////////////////////////////////////////////////////////////
		System.out.println("\n\n■ [003] HashSMap");
		HashMap<Integer,MilkDto1> map = new HashMap<Integer,MilkDto1>();
		map.put(1, new MilkDto1(1,"white",1000));
		map.put(2, new MilkDto1(2,"choco",1200));
	    print = new WildPrint<HashMap>(map); 
	    print.show();
		////////////////////////////////////////////////////////////////////////
	}
}
