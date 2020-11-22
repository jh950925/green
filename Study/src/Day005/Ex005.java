package Day005;

public class Ex005 {

	public static void main(String[] args) {
		
		double year = 365.2422;
					
//		1일 = 86400초
//		1시간 = 3600초
//		1분 = 60초
//		1초 = 1초
		
		int d_s = 60*60*24;
		int h_s = 60*60;
		int m_s = 60;
		
		int year01 = (int)(year*d_s);	//1년 초단위 계산
		int d,h,m,s = 0;
		
		d=year01/d_s;
		year01=year01%d_s;
		
		h=year01/h_s; 
		year01=year01%h_s;
	    
	    m=year01/m_s;
	    year01=year01%m_s;
	    
	    s=year01%60;
		
		System.out.println(""+ d + "일 " + h + "시간 " + m + "분 " + s + "초");
		
				
	}

}
