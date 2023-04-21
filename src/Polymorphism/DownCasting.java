package Polymorphism;
//1.Derived Type Casting
//It is process of converting reference from one class to another class is called as Derived Type Casting
//Derived Type Casting is also called as non primitive type casting
//it is classified into two types:
//1.UpCasting
//2.DownCasting

//2.DownCasting
		//It is a process of converting the reference from parent to child class
		//We can not perform downcasting automatically
		//In order to perform downcasting we need to take help of Cast Operator
		//In order to perform downcasting we need to create object for child class such that we can load the members of its own class and child class
		//To do downcasting upcasting is mandatory
public class DownCasting {
	
	public static void main(String[] args) {
		//this class is only execution purpose
		//object creation for child with upcasting
		System.out.println("----------------------");
		Employee1 sd=new SoftwareTest();
		sd.work();		//member of its own class
		//sd.Coding();  	//member of its child class
		//sd.App();		//member of its child class
		
		
		//downcasting from  parent to child class
		//Employee1 to SoftwareEngineer1
		System.out.println("----------------------");
		SoftwareEngineer1 se=(SoftwareEngineer1)sd;
		se.App(); 			//member of its own class
		se.work();			//member of its parent class
		//se.testing()  ---> // Member of child class (CTE) 
		
		
		//downcasting from parent to child class
		//SoftwareEngineer1 to SoftwareTest		
		System.out.println("----------------------");
		SoftwareTest st=(SoftwareTest)se;  // or e=(SoftwareTest)sd
		st.testing();		//member of its own class
		st.App();		// Member of parent class 
		st.work();	// Member of parent class 
		
	}

}
class Employee1
{
	public void work()
	{
		System.out.println("Work is mandatory for Employee");
	}
}
class SoftwareEngineer1 extends Employee1
{
	public void App()
	{
		System.out.println("Work regarding Software Application");
	}
}
class SoftwareTest extends SoftwareEngineer1
{
	public void testing()
	{
		System.out.println("Testing the bugs in software");
	}
}