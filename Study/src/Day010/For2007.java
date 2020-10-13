package Day010;

public class For2007 {

	public static void main(String[] args) {
		System.out.println("========for========");
		int i = 0, sum = 0, j = 0;
		boolean first = true;
		for (i = 1; i <= 10; i++) {
			sum = 0;
			for (j = 1; j <= (i * 10); j++) {
				if (first) {
					first=false;
				} else {
					System.out.print("+");
				}
				System.out.print(j);
				sum += j;
			}
			first=true;
			System.out.println("=" + sum);
		}
		
		System.out.println("========while========");
		i = 1; sum = 0; j = 1; first = true;
		while(i<=10){
			j=1;
			first=true;
			while(j <= (i * 10)) {
				sum += j;
				if (first) {
					first=false;
				} else {
					System.out.print("+");
				}
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println("=" + sum);
			sum=0;
		}
		
		System.out.println("========do hile========");
		i = 1; sum = 0; j = 1; first = true;
		do {
			do {
				sum += j;
				if (first) {
					first=false;
				} else {
					System.out.print("+");
				}
				System.out.print(j);
				j++;
			}while(j <= (i * 10));
			j=1;
			i++;
			first=true;
			System.out.println("=" + sum);
			sum=0;
		}while(i<=10);
	}
}