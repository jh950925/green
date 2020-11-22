package Day014;

public class Ex018 {

	public static void main(String[] args) {
		//선언
		String name[]= {"아이언맨","헐크","캡틴","토르","호크아이"};
		int kor[] = {100,100,30,70,35};
		int eng[] = {100,100,30,80,35};
		int mat[] = {100,100,30,60,35};
		String jang[] = {"","","","",""};
		String star[] = {"","","","",""};
		int rank[] = {1,1,1,1,1};
		int avg[] =new int[5];
		String hap[] =new String[5];
		int size =name.length;
		
		//조건+처리
		for(int i=0;i<size;i++) {
			//(평균+장학생+합격)출력
			for(int j=0; j<size; j++) {
				avg[i] = (kor[i]+eng[i]+mat[i])/3;
				if(avg[i]>=60) {
					hap[i] = "합격";
				}else {
					hap[i] = "불합격";
				}
				if(avg[i]>=95) {
					jang[i] = "장학생";
				}
			}
			//별출력
			for(int a=1;a<=((int)avg[i]/10);a++) {
				star[i] += "*";
			}
		}
		//등수출력
		for(int a=0;a<size; a++) {
			for(int b=0; b<size; b++) {
				if(avg[a]>avg[b]) {
					rank[b]++;
					System.out.println("[up] "+"Rank -a:"+ a + "\t"+"b:"+b+"\t"+"rank[a]:"+rank[a]+"\t"+"rank[b]"+rank[b]);
				}else if(avg[a]==avg[b]) {
					System.out.println("[save] "+"Rank -a:"+ a + "\t"+"b:"+b+"\t"+"rank[a]:"+rank[a]+"\t"+"rank[b]"+rank[b]);
					break;
				}else if(avg[a]<avg[b]) {
					System.out.println("[down] "+"Rank -a:"+ a + "\t"+"b:"+b+"\t"+"rank[a]:"+rank[a]+"\t"+"rank[b]"+rank[b]);
					rank[b]--;
				}
//				System.out.print("\t("+rank[b]+")\t");
			}
		}
		//출력
		System.out.println("============================================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t등수\t합격\t장학생\t랭킹");
		System.out.println("============================================================================");
		for (int i = 0; i < size; i++) {
				System.out.print(name[i]+"\t"
						+kor[i]+"\t"
						+eng[i]+"\t"
						+mat[i]+"\t"
						+avg[i]+"\t"
						+rank[i]+"\t"
						+hap[i]+"\t"
						+jang[i]+"\t"
						+star[i]+"\t");
			System.out.println();
		}
		System.out.println("============================================================================");
		
		
	}

}
