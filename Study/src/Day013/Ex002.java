package Day013;

public class Ex002 {

	public static void main(String[] args) {

		char ch [] = {'B','a','n','a','n','a',};
		int sum=0,sum1=0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				sum +=1;
			}else if(ch[i]>='a' && ch[i]<='z') {
				sum1 +=1;
			}
		}
		System.out.println("대문자 : "+sum+"\n소문자 : "+sum1);
	}

}
