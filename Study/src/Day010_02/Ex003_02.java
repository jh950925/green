package Day010_02;

public class Ex003_02 {

	public static void main(String[] args) {
		int i=0,j=0;
		String sum ="";
		boolean first =true, sec=true;
		
		for(i=1;i<=10;i++){
			if(first) {
				first=false;
			}else {
				System.out.print("+");
			}
			
			j+=i;
			if(sec) {
				sec=false;
				System.out.print(i);
			}else {
				System.out.print("("+sum+i+")");
			}
			sum+=""+i+"+";
		}
		System.out.println("="+j);
		
		i=1;j=0;sum="";first=true;sec=true;
		while(i<=10) {
			if(first) {
				first=false;
			}else {
				System.out.print("+");
			}
			j+=i;
			if(sec) {
				sec=false;
				System.out.print(i);
			}else {
				System.out.print("("+sum+i+")");			
			}
			sum+=""+i+"+";
			i++;
		}
		System.out.println("="+j);
		
		i=1;j=0;sum="";first=true;sec=true;
		do {
			if(first) {
				first=false;
			}else {
				System.out.print("+");
			}
			j+=i;
			if(sec) {
				sec=false;
				System.out.print(i);
			}else {
				System.out.print("("+sum+i+")");
			}
			sum+=""+i+"+";
			i++;
		}while(i<=10);
		System.out.println("="+j);
	}

}
