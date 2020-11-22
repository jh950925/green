package Day011;

public class For2009 {

	public static void main(String[] args) {

		int i=1, j=1, sum=0, num=0, a=10;
		
		for(i=1;i<=10;i++) {	//;사용하면 위에 있는 조건식을 생략 가능 ;;은 조건 1 2 둘다 생략 가능
			for(j=1;j<=a;j++) {
				sum+=++num;
				System.out.print(num);
				if(j<=a-1) {
					System.out.print("+");
				}
			}
			System.out.print("="+sum+"");
			if(i>11) {
				break;
			}
			j=1;
			sum=0;
			System.out.println();
		}
	}

}
