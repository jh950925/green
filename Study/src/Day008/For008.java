package Day008;

public class For008 {

	public static void main(String[] args) {

		int A = 0;
		 for(char ch='a'; ch<='z'; ch++){
		 if(ch =='a' || ch =='e' || ch=='i' || ch=='o' ||ch=='u'){
		   A++;
		 }
		}
		System.out.println("모음의 개수는 "+ A + "개 입니다.");
	}

}
