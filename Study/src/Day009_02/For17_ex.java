package Day009_02;

public class For17_ex {

	public static void main(String[] args) {
		String level2="";
		float avg=80.7f;
		int level=0;
		
		level = ((int)avg/10);
		
		for(level=1;level<11;level++) {
			level2 += "*";
		}
		System.out.println(level2);
		
	}

}
