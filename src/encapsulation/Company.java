package encapsulation;

public class Company {

	public static void main(String[] args) {

		Employee s1 = new Employee(112,"EMP1@gmail.com");

		s1.detailsOfEmployee();
		System.out.println("--------------------");
		// we can not access EmailId directly

		s1.set_EmailId("EMPLOYEE1@gmail.com");
		System.out.println(s1.get_EmailId());

	}

}

class Employee {
	int empNumber;
	private String emailId;

	// getter method
	public String get_EmailId() {
		return emailId;
	}

	// setter method
	public void set_EmailId(String e) {
		this.emailId = e;
	}

	// constructor
	Employee(int n, String e) {
		this.empNumber = n;
		this.emailId = e;
	}

	// NS-method
	public void detailsOfEmployee() {
		System.out.println(this.empNumber);
		System.out.println(this.emailId);
	}
}
