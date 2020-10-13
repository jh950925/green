package Day008;

public class For004 {

	public static void main(String[] args) {

		int num=0, sum=0;
		
		System.out.println("for문을 이용하여 1~10까지의 합을 구하시오");
				
		for(num=1;num<=10;num++) {
			sum += num;
			System.out.print(num);
			if(num<10) {				//for문안에 있는 조건문이기 때문에 if조건과 else 조건의 출력문들이 반복으로 들어간다. 
				System.out.print("+");	//for문은 한번 전체적으로 실행하기 때문에 num출력 후 if문이나 else문까지 한번 반복된 후 다시 sum +=num;으로 올라감
			}else {
				System.out.print("=");
			}
		}
		
		System.out.println(sum);
		
	}

}
