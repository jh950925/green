package Day008_02;

public class For006_boolean {

	public static void main(String[] args) {

		int hap=0;
		boolean first = true;
		
		for(int i=1; i<10; i++) {
			if(i%3==0) {
				hap +=i;	//hap 더하기
				if(first) {
					first =false;	//처음에만 질문
				}else {
					System.out.print("+");
				}
				System.out.print(i);
			}
		}	
		System.out.println("="+hap);
	}

}
