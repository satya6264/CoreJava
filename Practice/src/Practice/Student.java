package Practice;

public class Student {
	private int sid;
	private String sname;
	private double sfee;
	private Address address;
	private String aloc;
	private String city;
	private String state;
	private String pincode;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, double sfee, Practice.Address address, String aloc, String city, String state,
			String pincode) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.address = address;
		this.aloc = aloc;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSfee() {
		return sfee;
	}

	public void setSfee(double sfee) {
		this.sfee = sfee;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getAloc() {
		return aloc;
	}

	public void setAloc(String aloc) {
		this.aloc = aloc;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", address=" + address + ", aloc=" + aloc
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
	
	
	
//	public Student(int sid, String sname, double sfee, Address address) {
//		super();
//		this.sid = sid;
//		this.sname = sname;
//		this.sfee = sfee;
//		this.address = address;
//	}
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public int getSid() {
//		return sid;
//	}
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//	public String getSname() {
//		return sname;
//	}
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
//	public double getSfee() {
//		return sfee;
//	}
//	public void setSfee(double sfee) {
//		this.sfee = sfee;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	@Override
//	public String toString() {
//		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", address=" + address + "]";
//	}
//	
//
//	public Student(int sid, String sname, double sfee, String aloc, String city, String state, String pincode) {
//		super();
//		this.sid = sid;
//		this.sname = sname;
//	this.sfee = sfee;
//		this.aloc = aloc;
//		this.city = city;
//		this.state = state;
//		this.pincode = pincode;
//	}
//
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//}
//
//	public int getSid() {
//		return sid;
//	}
//
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//
//	public String getSname() {
//		return sname;
//	}
//
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
//
//	public double getSfee() {
//		return sfee;
//	}
//	public void setSfee(double sfee) {
//		this.sfee = sfee;
//	}
//
//	public String getAloc() {
//		return aloc;
//	}
//
//	public void setAloc(String aloc) {
//		this.aloc = aloc;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//
//	}
//	@Override
//	public String toString() {
//		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", aloc=" + aloc + ", city=" + city
//				+ ", state=" + state + ", pincode=" + pincode + "]";
//	}
}
