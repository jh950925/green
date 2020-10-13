package Day012;

public class Ex012 {

	public static void main(String[] args) {

		String value = "12o34";
		char ch = ' ';
		boolean num = true;
		
		for(int i=0;i<=4;i++) {
			ch = value.charAt(i);
			if(ch>=65) {	// ch<='0' %% ch>='9' ch>=65(대문자A)
							//만약 기호로 까지 포함하려면 '0'이런식으로 아스키에서
							//직접 번호 검출해서 0~9보다 작거나 크거나로 판단
				num = false;
			}else {
				num = true;
			}
			if(num==false) {
				System.out.println(ch+"는 숫자가 아닙니다.");
			}else {
				System.out.println(ch+"는 숫자입니다.");
			}
		}
	}

}
