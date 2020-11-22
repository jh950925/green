package Day030;

public class Total extends Process{
	@Override
	double exec(int kor, int eng, int math) {
		int result = 0 ;
		result = kor + eng + math;
		return result;
	}
	@Override
	double exec(int total) { return 0; }
	@Override
	String exec(double avg) { return null; }
}
