package Day010;

public class Ex002 {

	public static void main(String[] args) {

		int i = 0;
		int sum= 0;
		boolean first = true;
		
		for(i=1; i<=20; i++){
			if(i%2!=0 && i%3!=0){
				sum += i;
				System.out.print(i);
				if(i<19){				
					System.out.print("+");	
				}else {
					System.out.print("=");
				}
			}
		}
		System.out.println(sum + " / {for}");
		System.out.println("");
		
		i=1; sum=0;
		while(i<=20) {
			if(i%2!=0 && i%3!=0){
				if(first) {
					first =false;	
				}else {
					System.out.print("+");
				}
				sum += i;
				System.out.print(i);
			}
			i++;
		}
		System.out.println("="+ sum + " / {while}");
		System.out.println("");
		
		i=1; sum=0;
		do {
			if(i%2 !=0 && i%3 !=0) {
				System.out.print(i);
				switch(i) {
				case 19 :
				System.out.print("=");break;
				default :  
					System.out.print("+");  
				}
				sum += i;
				}
			i++;
		}while(i<=20);
		System.out.print(sum + " / {do while}");
	}

}
