package Polymorphism;
//1.Derived Type Casting
//It is process of converting reference from one class to another class is called as Derived Type Casting
//Derived Type Casting is also called as non primitive type casting
//it is classified into two types:
//1.UpCasting
//2.DownCasting


//1.Upcasting
		//Its a process of converting child class reference to parent class is called as Upcasting
		//in order to perform upcasting we need to create object of an child class
		//then we need to create an object reference variable for parent class and pass the address from child to parent class
public class Upcasting {
	
	public static void main(String[] args) {
		//this class is only execution purpose
		//object creation for child
		System.out.println("----------------------");
		SoftwareDev sd=new SoftwareDev();
		sd.Coding();  	//member of its own class
		sd.App();		//member of its parent class
		sd.work();		//member of its parent class
		
		
		//upcasting from child to parent class
		//SoftwareDev to SoftwareEngineer
		System.out.println("----------------------");
		SoftwareEngineer se=sd;
		se.App(); 			//member of its own class
		se.work();			//member of its parent class
		//se.coding()  ---> // Member of child class (CTE) this method is not accessible now because of Upcasting 
		
		
		//upcasting from child to parent class
		//SoftwareEngineer to Employee		
		System.out.println("----------------------");
		Employee e=se;  // or e=sd
		e.work();		//member of its own class
		//e.App();		// Member of child class (CTE) this method is not accessible now because of Upcasting 
		//e.coding();	// Member of child class (CTE) this method is not accessible now because of Upcasting 
		
	}

}
class Employee
{
	public void work()
	{
		System.out.println("Work is mandatory fro Employee");
	}
}
class SoftwareEngineer extends Employee
{
	public void App()
	{
		System.out.println("Work regarding Software Application");
	}
}
class SoftwareDev extends SoftwareEngineer
{
	public void Coding()
	{
		System.out.println("Dev the Software by creating code");
	}
}