package Practice;

public class Account {
	private int aid;
	private String aname;
	private double abal;

	public Account(int aid, String aname, double abal) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.abal = abal;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public double getAbal() {
		return abal;
	}

	public void setAbal(double abal) {
		this.abal = abal;
	}

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", aname=" + aname + ", abal=" + abal + "]";
	}

}
