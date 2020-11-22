package Day014_02;

public class Ex018 {

		public static void main(String[] args) {
			String [] name = {"아이언맨","헐크","캡틴","토르","호크아이"};
			int [] kor = {100,20,30,70,35};
			int [] eng = {100,20,30,80,35};
			int [] math = {100,20,30,60,35};
			int [] aver = new int[5];
			String [] result = new String[5];
			String [] schp = new String[5];
			int [] rank = {1,1,1,1,1};
			String [] star = {"","","","",""};
			
			
			
			
			for (int i = 0; i < aver.length; i++) {
				aver[i] = (kor[i]+eng[i]+math[i])/3;
				if (aver[i]<40) {
					result[i] = "불합격";
				} else {
					result[i] = "합격";
				}
				if (aver[i]>=95) {
					schp[i] = "장학생";
				} else {
					schp[i] = "---";
				}
			}
			
			int count= 0;
			for (int i = 0; i < star.length; i++) {
				for (int j = i+1; j < star.length; j++) {
					if (aver[i]>aver[j]) {
						rank[j]++;
					} else if (aver[i]==aver[j]) {
						break;
					}
				}
			}
			
			for (int i = 0; i < star.length; i++) {
				for (int j = 0; j < aver[i]/10; j++) {
					star[i] += "*";	
				}
			}
			
			
			System.out.println("==============================================================================");
			System.out.println("이름\t국어\t영어\t수학\t평균\t등수\t합격여부\t장학생\t랭킹");
			System.out.println("==============================================================================");
			for (int i = 0; i < name.length; i++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%s\t%s\t%s\n",name[i],kor[i],eng[i],math[i],aver[i],rank[i],result[i],schp[i],star[i]);
			}
			System.out.println("==============================================================================");
			
	}

}
