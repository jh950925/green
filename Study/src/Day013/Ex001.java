package Day013;

public class Ex001 {

	public static void main(String[] args) {

		char ch [] = {'B','a','n','a','n','a'};
		int sum = 0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a') {
				sum += 1;
			}
		}
		System.out.println(sum+"개입니다.");
	}

}
