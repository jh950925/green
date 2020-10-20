package Day014;

public class Ex017 {

	public static void main(String[] args) {
		String name[]= {"아이언맨","헐크","캡틴","토르","호크아이"};
		int kor[] = {100,20,90,70,35};
		int eng[] = {100,50,95,80,100};
		int mat[] = {100,30,90,60,100};
		int aver[] =new int[5];
		String hap[] =new String[5];
		String jang[] =new String[5];
		int size =name.length;
		
		
		//평균 처리
		for(int i=0;i<size;i++) {
			aver[i] = (kor[i]+eng[i]+mat[i])/3;
			for(int j=0; j<size; j++) {
				if(aver[i]>=60) {
					hap[i] = "합격";
				}else {
					hap[i] = "불합격";
				}
				if(aver[i]>=95) {
					jang[i] = "장학생";
				}else {
					jang[i] = "----";
				}
				
			}
		}
		//합격여부
		System.out.println("======================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생");
		System.out.println("======================================================");
		for (int i = 0; i < size; i++) {
//			for (int j = 0; j < 1; j++) {
				System.out.print(name[i]+"\t"
						+kor[i]+"\t"
						+eng[i]+"\t"
						+mat[i]+"\t"
						+aver[i]+"\t"
						+hap[i]+"\t"
						+jang[i]+"\t");
//			}
			System.out.println();
		}
		System.out.println("======================================================");
	}
}

