package Polymorphism;
//2.Method Overriding

//Its a process of overriding parent class method implementation by child class method implementation is called as method overriding
//Rules of perform method overriding:
//1.There should be Is_a relationship
//2.Method header of both parent and child class has to be same
//3.we need to create an object of child class

public class ConfirmationExample {

	public static void main(String[] args) {
		//object creation for child class
		Sbi1 s=new Sbi1();
		//System.out.println(s);
		//System.out.println(s.Roi()); //12
		System.out.println(s.a);
		System.out.println(s.c);
		
		
		//upcasting fro Sbi to Bank
		Bank1 b=s;
		//System.out.println(b.Roi()); //12 calling method of parent but performing implementation of child
		System.out.println(b.a);
		System.out.println(b.c);
		
	}
}

class Bank1 
{
	static int a=10;
	 int c=0;
	//ns-method
	public int Roi()
	{
		return 0;
	}
}

class Sbi1 extends Bank1
{
	static int a=20;
	 int c=30;
	//ns-method
	public int Roi()
	{
		return 12;
	}
}
