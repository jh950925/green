package Day025;

import Day025_02.Score_ver2;
import Day025_02.Score_ver2_ex;

public class Class035 {
	public static void main(String[] args) {
		Score_ver2 iron = new Score_ver2("아이언맨",100,100,99);
		Score_ver2_ex ex = new Score_ver2_ex();
		
		double[] result1 = ex.exec(iron.getKor(), iron.getEng(), iron.getMath());
		iron.setTotal((int)result1[0]);
		iron.setAver(result1[1]);
		String result2 = ex.exec(iron.getAver());
		iron.setP(result2);
		String result3 = ex.exec_jang(iron.getAver());
		iron.setS(result3);
		String result4 = ex.exec_star(iron.getAver());
		iron.setRank(result4);
		ex.exec_show(iron);
	}
}
