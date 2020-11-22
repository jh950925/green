package Day014;

public class Ex016 {

	public static void main(String[] args) {
			int num [] = new int[6];
			
			System.out.print("이번주 로또 번호는 : ");
			for(int i=0; i<num.length;i++) {
				num[i] = (int)((Math.random()*45)+1);
				for(int j=0;j<i;j++) {
					if(num[j]==num[i]) {
						num[i] = (int)((Math.random()*45)+1);
					}
				}
				System.out.print(num[i]+"\t");
			}
	}
}
