package Practice;

public class Address {
	String Loc;
	String City;
	String State;
	int Pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String loc, String city, String state, int pincode) {
		super();
		Loc = loc;
		City = city;
		State = state;
		Pincode = pincode;
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	

}
