package Day006;

public class Ex010 {

	public static void main(String[] args) {

		//C(섭씨) =5/9 ×(F - 32)  단 변환 결과값은 소수점 셋째자리에서 반올림해야한다 Math , String을 사용하지 않고 처리하시오.  
		
		
		  int F = 100;
	      float C = (float)((5/9.0f)*(F-32));      // 37.77778
	      
	      C = (float)((float)((int)((C)*1000)
	    		  +((C%1) >= 0.5? 1:0)
	    		  )/1000.0);	
	      
	       	      
	      System.out.println("화씨 : " + F);
	      System.out.println("썹씨 : " + C);
	      
	}

}
