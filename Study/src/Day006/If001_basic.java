package Day006;

public class If001_basic {

	public static void main(String[] args) {
		
		int a = 0;
		
		//1형식	if(조건식){조건식이 맞을 때 처리}
		//조건식이 맞아야지만 처리 됨. 처리 됐는지 판단하기가 힘듦
		if( a == 0) {System.out.println("zero");}
		
		//2형식 % else 뒤에는 조건식이 못옴.
		/*
		 * if(조건식){조건식이 맞을때 처리}
		 * else{조건식이 틀릴때 처리}
		 */
		if (a == 0) {System.out.println("zero");}
		else {System.out.println("zero가 아니다.");}
		
		
		//3형식
		/*
		 * if (조건식 1){조건식 1이 맞을때 처리}
		 * else if(조건식2){조건식 2가 맞을때 처리}
		 * else if(조건식3){조건식 3가 맞을때 처리}
		 * else{조건식이 틀릴때 처리}
		 */
		if (a == 1) {System.out.println("1이다.");}
		else if (a == 2) {System.out.println("2이다.");}
		else if (a == 3) {System.out.println("3이다.");}
		else {System.out.println("1,2,3이 아니다.");}

	}

}
