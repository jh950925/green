package Day030;

public class Pass extends Process{
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
		if(avg >=60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		return result;
	}
}
