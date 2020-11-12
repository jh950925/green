package Day029;

import java.util.Arrays;

class Point{
	double x,y;
	public Point() {  }
	public Point(double x, double y) { super(); this.x = x; this.y = y; }
	public Point(Point point) {  }
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
abstract class Shape_ex{
	private Point p; 
	public Shape_ex() {
		this(new Point(0,0));
	}
	public Shape_ex(Point p) {
		super();
		this.p=p;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p=p;
	}
	abstract double calcArea();
}
class Circle_ex extends Shape_ex{
	double r;
	public Circle_ex() { super(); }
	
	public Circle_ex(double r) {
		super();
		this.r=r;
	}
	@Override
	double calcArea() {
		double result =0.0;
		result = this.r*this.r*Math.PI;
		return result;
	}
}
class Rectangle_ex extends Shape_ex{
	double width;
	double height;
	Rectangle_ex(){ super(); }
	
	Rectangle_ex(double width, double height) {
		super();
		this.width=width;
		this.height=height;
	}
	public boolean isSquare() {
		if(width==height && (width!=0) && (height!=0)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	double calcArea() {
		double result=0.0;
		result = this.width*this.height;
		return result;
	}
}


public class Ex005 {
	public static void main(String[] args) {
		Shape_ex[] arr = {
						     new Circle_ex(5.0)
							,new Rectangle_ex(3,4)
							,new Circle_ex(1)
						 };
//		System.out.println(Arrayrs.toString(arr));
		System.out.println("면적의 합 : " + sumArea(arr));
	}

	private static double sumArea(Shape_ex[] arr) {
		double result = 0.0;
		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i].calcArea());
			result += arr[i].calcArea();
		}
		return result;
	}
}
