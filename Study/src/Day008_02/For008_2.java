package Day008_02;

public class For008_2 {

	public static void main(String[] args) {

		int A = 0;
		 for(char ch='a'; ch<='z'; ch++){
			 switch(ch) {
			 case 'a' :
				 A++;break;
			 case 'e' :
				 A++;break;
			 case 'i' :
			 	A++;break;
			 case 'o' :
				 A++;break;
			 case 'u' :
				 A++;break;
			 }
		}
		System.out.println("모음의 개수는 "+ A + "개 입니다.");
	}

}
