package Day030;

public class Avg extends Process{
	@Override
	double exec(int kor, int eng, int math) { return 0; }
	@Override
	double exec(int total) {
		double result = 0.0;
		result = total / 3.0;
		return result;
	}
	@Override
	String exec(double avg) { return null; }
}
