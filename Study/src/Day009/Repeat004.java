package Day009;

public class Repeat004 {

	public static void main(String[] args) {
		
		int num=0,i=0;
		boolean first = true;
				
		for(i=1;i<=10;i++) {
			if(i%3==0) {
				num += i;
				System.out.print(i);
				if(i<9){				
					System.out.print("+");	
				}else {
					System.out.print("=");
				}
			}
		}
		System.out.println(num + " / {for}");
		
		System.out.println();
		
		
		
		i=1; num=0;
		while(i<=10) {
			if(i%3==0) {
				if(first) {
					first =false;	
				}else {
					System.out.print("+");
				}
				num += i;
				System.out.print(i);
			}
			i++;
		}
		System.out.println("="+ num + " / {while}");
		
		System.out.println();
		 
		
		i=1; num=0; first=true;
		do {
			if(i%3==0) {
				System.out.print(i);
				switch(i) {  //3
				case 9 :  //i 가 10이라면...  
					System.out.print("=");break;
				default :  
					System.out.print("+");  
				}
				num += i;
			}// end
			i++;
		}while(i<=10);
		System.out.println(num + " / {do while}");
	}

}
