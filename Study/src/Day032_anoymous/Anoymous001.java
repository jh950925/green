package Day032_anoymous;

interface Fish{
	public String fishType();
	public void breath();
}
/////////////////////////////////////////////////////////
class flatfish implements Fish{
	@Override public String fishType() { return "광어"; }
	@Override public void breath() { 
		System.out.println(this.fishType()+"는 모래바닥에서 숨을 쉽니다.");
	}
}
/////////////////////////////////////////////////////////
public class Anoymous001 {
	public static void main(String[] args) {
		Fish myfish = new flatfish();
		myfish.breath();
		
		Fish myfish2 = new Fish() {
			@Override
			public String fishType() {
				return "붕어";
			}
			@Override
			public void breath() {
				System.out.println(this.fishType()+"Good!");
			}
		};
		myfish2.breath();
	}//end main
}//end class
