package encapsulation;

public class Exp3School {

	public static void main(String[] args) {
		// Encapsulation we can achieve by creating variables private and by creating setter getter

		Student s1=new Student("sagar",123,"9632587410");
		
		s1.details();
		System.out.println("--------------------");
			
		//we can not access Mnumber directly
		
		s1.set_Mnumber("9658321000");
		System.out.println(s1.get_Mnumber());	
		
	}

}

class Student {

	//NS-variables
	String name;
	int rollNo;
	private String Mnumber;
	
	//getter method
	public String get_Mnumber()
	{
		return Mnumber;
	}
	
	//setter method
	public void set_Mnumber(String m)
	{
		this.Mnumber=m;
	}
	
	//constructor
	Student(String n,int r,String m)
	{
		this.name=n;
		this.rollNo=r;
		this.Mnumber=m;
	}
	
	//NS-method
	public void details()
	{
		System.out.println(this.name);
		System.out.println(this.rollNo);
		System.out.println(this.Mnumber);
	}	
}
