package Day032_Inner;


public class Class001_Inner {

	public static void main(String[] args) {
		KimBob kimbob = new KimBob();
		kimbob.order();
		KimBob.DanMugi dan = new KimBob().new DanMugi();
		dan.show();
	}
}
