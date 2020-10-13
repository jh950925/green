package Day013;

public class Ex003 {

	public static void main(String[] args) {

		char [] ch = new char[52];
		int sum=0;
		char data = 'A';

		for(int i=0;i<ch.length;i++) {
			ch[i] = data;
			data += 1;
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'
					||	ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				sum++;
			}
			if(i==25) {
				data = 'a';
			}
//			System.out.println(ch[i]);
		}
		System.out.println("갯수는 : " + sum);
	}
}
