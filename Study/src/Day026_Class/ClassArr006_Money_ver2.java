package Day026_Class;

public class ClassArr006_Money_ver2 {
	
	static final String BANKNAME= "Green Bank";
	static double rate =0.1;
	private String user_name;
	private long user_won;
	private String ranking; //green, silver, gold
	
//	@Override
//	public String toString() {
//		return "ClassArr006_Money_ver2 [ranking=" + ranking + "]";
//	}
	public String getUser_name() {
		return user_name;
	}
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		ClassArr006_Money_ver2.rate = rate;
	}
	public static String getBankname() {
		return BANKNAME;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public long getUser_won() {
		return user_won;
	}
	public void setUser_won(long user_won) {
		this.user_won = user_won;
	}
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public ClassArr006_Money_ver2() {
		super();
	}
	public ClassArr006_Money_ver2(String user_name, int user_won) {
		super();
		this.user_name = user_name;
		this.user_won = user_won;
	}

}
