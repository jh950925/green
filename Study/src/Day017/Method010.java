package Day017;

public class Method010 {

	public static void main(String[] args) {

		char ch = 'A';
		char res = lower(ch);
		System.out.println(res); // 'a'
	}
 
	public static char lower(char ch) {
		int result = 0;
		if (ch >= 'A' && ch <= 'Z') {
			result = ch + 32;
		}

		return (char) result;
	}
}
