package Polymorphism;
public class MethodOverridingExample {

	public static void main(String[] args) {
		//object creation for child class
		Bike b=new Bike();
		System.out.println(b);
		b.run(); 
		
		//upcasting fro Bike to Vehicle
		Vehicle v=b;
		v.run(); //calling method of parent but performing implementation of child
		
	}
}

class Vehicle 
{
	//ns-method
	public void run()
	{
		System.out.println("Vehicle is run");
	}
}

class Bike extends Vehicle
{
	//ns-method
	public void run()
	{
		System.out.println("Bike is running safely");
	}
}
