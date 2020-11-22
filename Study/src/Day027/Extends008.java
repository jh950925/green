package Day027;

import java.util.Scanner;


class User{
	//멤버변수
	private String name;
	private String id;
	
	//멤버함수
	public void show() {
		System.out.println("==================================================================");
		System.out.println("이름\t아이디\tJAVA\tJSP\tMYSQL\tSPRING\tPROJECT\tTOTAL\tAVG");
		System.out.println("==================================================================");
		System.out.print(""+this.id+"\t"+this.name+"\t");
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	
	//생성자
	public User() {
		super(); 
	}
	public User(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
}
/////////////////////////////////////////////////////////////
class Score_v1 extends User{
	//멤버변수
	private int java, jsp, mysql;
	
	//멤버함수
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("id : ");    setId(scanner.next());
		System.out.println("name : ");  setName(scanner.next());
		System.out.println("Java : ");  this.java = scanner.nextInt();
		System.out.println("jsp : ");   this.jsp = scanner.nextInt();
		System.out.println("mysql : "); this.mysql = scanner.nextInt();
	}
	public void show() {
		super.show();
		System.out.print(""+this.java+"\t"+this.jsp+"\t"+this.mysql+"\t");
	}
	
	public int getJava() { return java; }
	public void setJava(int java) { this.java = java; }
	
	public int getJsp() { return jsp; }
	public void setJsp(int jsp) { this.jsp = jsp; }
	
	public int getMysql() { return mysql; }
	public void setMysql(int mysql) { this.mysql = mysql; }
	
	//생성자
	public Score_v1() {
		super();
	}
	public Score_v1(int java, int jsp, int mysql) {
		super();
		this.java = java;
		this.jsp = jsp;
		this.mysql = mysql;
	}
}
//////////////////////////////////////////////////////////////
class Score_v2 extends Score_v1{
	private int spring, project, total;
	private double avg;
	//멤버함수
	
	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();
		System.out.println("spring : ");  this.spring = scanner.nextInt();
		System.out.println("project : "); this.project = scanner.nextInt();
		scanner.close(); 
	}
	public void show() {
		super.show();
		System.out.print(""+this.spring+"\t"+this.project+"\t"+this.total+"\t"+String.format("%.2f", this.avg));
	}
	public int process_total() {
		this.total = getJava()+getJsp()+getMysql()+this.spring+this.project;
		return this.total;
	}
	public double process_avg() {
		this.avg =this.total/5.0;
		return this.avg;
	}
	public int getSpring() { return spring; }
	public void setSpring(int spring) { this.spring = spring; }
	
	public int getProject() { return project; }
	public void setProject(int project) { this.project = project; }
	
	public int getTotal() { return total; }
	public void setTotal(int total) { this.total = total; }
	
	public double getAvg() { return avg; }
	public void setAvg(double avg) { this.avg = avg; }
	//생성자
	public Score_v2() {
		super();
	}
	public Score_v2(int spring, int project, int total, double avg) {
		super();
		this.spring = spring;
		this.project = project;
		this.total = total;
		this.avg = avg;
	}
}
//////////////////////////////////////////////
public class Extends008 {
	public static void main(String[] args) {

		Score_v2 iron = new Score_v2();
		iron.input();
		iron.process_total();
		iron.process_avg();
		iron.show();
		
	}//end main
}//end class
