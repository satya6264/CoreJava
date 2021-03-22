package Practice;

//import com.vidvaan.clonning.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("Satya");
		employee.setEsal(2000.00);
		Address addr = new Address();
		addr.setLoc("SKLM");
		addr.setCity("SKLM");
		addr.setState("AP");
		addr.setPincode(532408);
		employee.setAddress(addr);
		
		
		
		Employee e2 = new Employee();
		e2.setEid(2);
		e2.setEname("Ravi");
		e2.setEsal(3000.00);
		e2.setAddress(addr);

//		System.out.println("Eid : " + employee.getEid());
//		System.out.println("Ename : " + employee.getEname());
//		System.out.println("Esal : " + employee.getEsal());
//		Address address = employee.getAddress();
//		if (address != null) {
//			System.out.println("Aloc : " + address.getAloc());
//			System.out.println("City : " + address.getCity());
//		}
//		
//		
//		System.out.println("Eid : " + e2.getEid());
//		System.out.println("Ename : " + e2.getEname());
//		System.out.println("Esal : " + e2.getEsal());
//		Address a2 = e2.getAddress();
//		if (a2 != null) {
//			System.out.println("Aloc : " + a2.getAloc());
//			System.out.println("City : " + a2.getCity());
//		}
		
		System.out.println(employee.toString());
		
		System.out.println(e2.toString());
	}


}
