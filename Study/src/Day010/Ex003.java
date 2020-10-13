package Day010;

public class Ex003 {

	public static void main(String[] args) {
		int sub=0, sum=0;
		
//		ver-1
//		회차	sub		sum
//		1		1		1
//				sub+=1; sum+=sub;
//		2		1+(2)	1 + (1+(2))
//				sub+=2;	sum+=sub;
		
		System.out.println("ㅁfor");
		for(int i=1; i<11; i++) {
			sub+=i;	sum+=sub;
		}
		System.out.println("1+(1+2)+(1+2+3)+....(1+2+3+...+10)="+sum);
		
		
		System.out.println("\n\nㅁwhile");
		int i=1; sum=0;sub=0;
		while(i<11)  {
			sub+=i;	sum+=sub;
			i++;
		}
		System.out.println("1+(1+2)+(1+2+3)+....(1+2+3+...+10)="+sum);
		
		System.out.println("\n\nㅁdo while");
		i=1; sum=0;sub=0;
		do {
			sub+=i;	sum+=sub;
			i++;
		}while(i<11);
		System.out.println("1+(1+2)+(1+2+3)+....(1+2+3+...+10)="+sum);
		
	}
	
}
