package Day011_02;

public class For_up {

	public static void main(String[] args) {
		System.out.println("=====[for]=====");
		for (int floor = 1; floor <= 6; floor++) {
			for (int room = 1; room <= 3; room++) {
				int dan = floor;  //채워주기
				int kan = (floor%3==0)? 3:floor%3;
				System.out.print("("+dan+")");
				System.out.print("("+kan+")");
				System.out.print(dan + "*" + kan + "=" + dan * kan+"\t");
			}
			System.out.println();
		}
	}

}

//1			2			3
//2*1=2		3*1=3		4*1=4		1층 floor : 1 / kan:1		1%3=1
//2*2=4		3*2=6		4*2=8		2층 floor : 2 / kan:2		2%3=2
//2*3=6		3*3=9		4*3=12		3층 floor : 3 / kan:3		3%3==0 kan을 3으로 만들기

//5*1=5		6*1=6		7*1=7		4층 floor : 4 / kan:1		4%3=1
//5*2=10	6*2=12		7*2=14		5층 floor : 5 / kan:2		5%3=2
//5*3=15	6*3=18		7*3=21		6층 floor : 6 / kan:3		6%3=0
