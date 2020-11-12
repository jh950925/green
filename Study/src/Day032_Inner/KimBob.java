package Day032_Inner;

public class KimBob {
	String name; int price;
	class DanMugi{
		public void show() { System.out.println("단무지추가"); }
	}
	class Rice{
		public void show() { System.out.println("밥추가"); }
	}
	class Kim{
		public void show() { System.out.println("김추가"); }
	}
	public void order() {
		Kim k1 = new Kim();
		k1.show();
		Rice r1 = new Rice();
		r1.show();
		DanMugi d1 = new DanMugi();
		d1.show();
	}
	public KimBob() {
		super();
	}
}

