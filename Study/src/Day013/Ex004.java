package Day013;

public class Ex004 {

	public static void main(String[] args) {

		char ch [] = {'B','a','n','a','n','a'};
		
		for(int i=0; i<ch.length; i++){
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i] = (char)(ch[i]+32); 
			}else if(ch[i]>='a' && ch[i]<='z') {
				ch[i] = (char)(ch[i]-32);
			}
			System.out.print(ch[i]);
		}
	}

}
