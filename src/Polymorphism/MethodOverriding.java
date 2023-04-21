package Polymorphism;
//2.Method Overriding

//Its a process of overriding parent class method implementation by child class method implementation is called as method overriding
//Rules of perform method overriding:
//1.There should be Is_a relationship
//2.Method header of both parent and child class has to be same
//3.we need to create an object of child class

public class MethodOverriding {

	public static void main(String[] args) {
		//object creation for child class
		Sbi s=new Sbi();
		System.out.println(s);
		System.out.println(s.Roi()); //12
		
		//upcasting fro Sbi to Bank
		Bank b=s;
		System.out.println(b.Roi()); //12 calling method of parent but performing implementation of child
		
		
	}
}

class Bank 
{
	//ns-method
	public int Roi()
	{
		return 0;
	}
}

class Sbi extends Bank
{
	//ns-method
	public int Roi()
	{
		return 12;
	}
}
