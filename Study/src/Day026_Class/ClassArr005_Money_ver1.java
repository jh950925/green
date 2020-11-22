package Day026_Class;

public class ClassArr005_Money_ver1 {

	static final String BANKBAME = "Green Bank";
	static double rate = -.1;
	private String user_name;
	private long user_won;
	private String ranking; //green, silver, gold
	
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public String getUser_name() {
		return user_name;
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
	public ClassArr005_Money_ver1() {
		super();
	}
	public ClassArr005_Money_ver1(String user_name, int user_won) {
		super();
		this.user_name = user_name;
		this.user_won = user_won;
	}
}
