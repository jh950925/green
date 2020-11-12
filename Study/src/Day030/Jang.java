package Day030;

public class Jang extends Process{
	@Override
	double exec(int kor, int eng, int math) { return 0; }
	@Override
	double exec(int total) { return 0; }

	@Override
	String exec(double avg) {
		String result  = "";
			if(avg>=95) {
				result = "장학생";
			}
		return result;
	}
}
