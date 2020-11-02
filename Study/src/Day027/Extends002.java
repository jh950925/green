package Day027;

class Color{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color() { 
		super();
	}
}
////////////////////////////////////////////////////////
class Green extends Color{
	int num;

	public void show() {
		System.out.println("이름 : " + getName());
		System.out.println("개수 : " + num);
	}
	
	public Green() {
		super();
	}
}
////////////////////////////////////////////////////////
public class Extends002 {

	public static void main(String[] args) {

		Green mygreen = new Green();
		mygreen.setName("Light_Green");
		mygreen.num = 5;
		mygreen.show();
		
	}

}
