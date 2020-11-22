package Day025_02;

public class Car4 {
	private String color; 
	private String gearType; 
	private int door; 
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car4 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}

	public Car4(){
		super();
	}
	
	public Car4(String color, String gearType, int door){
		super();
		this.color=color;
		this.gearType=gearType;
		this.door=door;
		
	}

}
