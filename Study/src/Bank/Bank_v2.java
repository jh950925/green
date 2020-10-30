package Bank;

import java.util.Arrays;

public class Bank_v2 {
	private String id;
	private String pass;
	private double balance;
	private int plus;
	private int minus;
	private char key;
	private static String Company = "(주) 하랑";
	private int num;
//	static Bank_Controller bank_c = new Bank_Controller();

	// 멤버함수
//	public void menu() {
//		Bank_Controller user1 = new Bank_Controller();
//		int num = 0;
//		do{
//			num = user1.menu();
//			switch (num) {
//			case 1:
//			bank_c.input(); break;
//			case 2:
//			bank_c.show(); break;
//			case 3:
//			bank_c.deposit(); break;
//			case 4:
//			bank_c.withdraw(); break;
//			case 5:
//			bank_c.delete(); break;
//			}
//		}while( num != 9);
//		
//	}

	@Override
	public String toString() {
		return "Bank_v2 [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}

	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public int getMinus() {
		return minus;
	}

	public void setMinus(int minus) {
		this.minus = minus;
	}

	public char getKey() {
		return key;
	}

	public void setKey(char key) {
		this.key = key;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static String getCompany() {
		return Company;
	}

	public static void setCompany(String company) {
		Company = company;
	}

	// 생성자
	public Bank_v2() {
		super();
	}

	public Bank_v2(String id, String pass, double balance) {
		super();
		this.id = id;
		this.pass = pass;
		this.balance = balance;
	}
}
