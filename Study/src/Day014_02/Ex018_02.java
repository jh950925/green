package Day014_02;

public class Ex018_02 {

	public static void main(String[] args) {
		int kor[] = {100,100,30,70,35};
		int eng[] = {100,100,30,80,35};
		int mat[] = {100,100,30,60,35};
		int avg[] =new int[5];
		String hap[] =new String[5];
		int size =hap.length;
		int rank[] = {1,1,1,1,1};
		
		for(int i=0;i<size;i++) {
			for(int j=0; j<size; j++) {
				avg[i] = (kor[i]+eng[i]+mat[i])/3;
			}
		}
		
		for(int a=0;a<size; a++) {
			for(int b=a+1; b<size; b++) {
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
			}
		}
		
		
		System.out.println("===================================================");
		System.out.println("평균\t1\t2\t3\t4\t5");
		System.out.println("===================================================");
		for(int i=0; i<size; i++) {
			System.out.print("  \t"+avg[i]+"\t"+rank[i]);
			System.out.println();
		}
	}
}
