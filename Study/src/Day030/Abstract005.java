package Day030;


public class Abstract005 {
	public static void main(String[] args) {
		int total = 0; double avg = 0.0;
		String jang =""; String pass = ""; String star="";
		ScoreDto std = new ScoreDto("헐크", 100, 100, 99);
		
		Process process = null; // 설계클래스
		
		process = new Total();  
		total  = (int)process.exec(std.getKor(), std.getEng(), std.getMath());
		std.setTotal(total);

		process = new Avg();  
		avg    = (double)process.exec(std.getTotal());
		std.setAvg(avg);

		process = new Jang();  
		jang   = (String)process.exec(std.getAvg());
		std.setJang(jang);
		
		process = new Pass();  
		pass   = (String)process.exec(std.getAvg());
		std.setPass(pass);
	
		process = new Star();  
		star   = (String)process.exec(std.getAvg());
		std.setStar(star);
		
		System.out.println(std);
		
		Print print = null;
		print = new stdPrint();
		print.show(std);
	}
}
////////////////////////////////////////////////////////////////////
