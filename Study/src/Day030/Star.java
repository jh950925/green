package Day030;

public class Star extends Process{
	@Override
	double exec(int kor, int eng, int math) {
		return 0;
	}

	@Override
	double exec(int total) {
		return 0;
	}

	@Override
	String exec(double avg) {
		String result = "";
		for(int i=1; i<=(avg/10); i++) {
			result += "*";
		}
		return result;
	}
}
