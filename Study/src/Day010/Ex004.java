package Day010;

public class Ex004 {

	public static void main(String[] args) {

		int a=1,sum=0, num =0;
		boolean frist = true;
		for(int i=1; sum<100; i++) {
			num = i*a;
			
			if(frist) {
				frist=false;
			}else {
				System.out.print("+");
			}
			
			if(num<0) {
				System.out.print("("+num+")");
			}else {
				System.out.print(num);
			}
			a = -a;
			sum +=num;
		}
		System.out.print("="+sum);
		
		System.out.println("\n");
		
		a=1;sum=0;num=0;frist=true;
		int i=1;
		while(sum<100) {
			num = i*a;
			
			if(frist) {
				frist=false;
			}else {
				System.out.print("+");
			}
			
			if(num<0) {
				System.out.print("("+num+")");
			}else {
				System.out.print(num);
			}
			a = -a;
			sum +=num;
			i++;
		}
		System.out.print("="+sum);
		
		System.out.println("\n");
		
		a=1;sum=0;num=0;frist=true;i=1;
		do {
			num = i*a;
			
			if(frist) {
				frist=false;
			}else {
				System.out.print("+");
			}
			
			if(num<0) {
				System.out.print("("+num+")");
			}else {
				System.out.print(num);
			}
			a = -a;
			sum +=num;
			i++;
		}while(sum<100);
		System.out.print("="+sum);
	}	
}
