package Practice;

public class TestAccount {
	public static void main(String[] args) {

		Account accounts[] = new Account[5];

		Account a1 = new Account(1, "Satya", 3000.00);
		Account a2 = new Account(2, "Raja", 3000.00);
		Account a3 = new Account(3, "Ravi", 3000.00);
		Account a4 = new Account(4, "Madhu", 3000.00);
		Account a5 = new Account(5, "Nagu", 3000.00);

		accounts[0] = a1;
		accounts[1] = a2;
		accounts[2] = a3;
		accounts[3] = a4;
		accounts[4] = a5;
		
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Aid: "+accounts[i].getAid());
			System.out.println("Aname: "+accounts[i].getAname());
			System.out.println("Abal: "+accounts[i].getAbal());
			System.out.println("---------------------------------");
		}

	}

}
