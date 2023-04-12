package encapsulation;

public class Flipkart {

	public static void main(String[] args) {
		
		Customer s1 = new Customer(85231,"Pune");

		s1.detailsOfCustomer();
		System.out.println("--------------------");
		// we can not access EmailId directly

		s1.set_Address("Chinchwad");
		System.out.println(s1.get_Address());
	}

}

class Customer
{
	int customerId;
	private String Address;

	// getter method
	public String get_Address() {
		return Address;
	}

	// setter method
	public void set_Address(String e) {
		this.Address = e;
	}

	// constructor
	Customer(int n, String e) {
		this.customerId = n;
		this.Address = e;
	}

	// NS-method
	public void detailsOfCustomer() {
		System.out.println(this.customerId);
		System.out.println(this.Address);
	}
}