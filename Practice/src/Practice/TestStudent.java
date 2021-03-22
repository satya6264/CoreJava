package Practice;

//import com.vidvaan.clonning.Address;

public class TestStudent {

	public static void main(String[] args) {
		Address add = new Address();
		add.setLoc("Prakash Nagar");
		add.setCity("Khammam");
		add.setState("Telangana");
		add.setPincode(507003);

		Student student = new Student();
		student.setSid(1001);
		student.setSname("Naresh");
		student.setSfee(5000);
		student.setAddress(add);

		Student student2 = new Student();
		student2.setSid(1002);
		student2.setSname("Mahesh");
		student2.setSfee(6000);
		student2.setAddress(add);

		System.out.println(student.toString());
		System.out.println(student2.toString());
	}

}
