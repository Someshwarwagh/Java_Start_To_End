package Polymorphism;
//1.Compile Time Polymorphism
	//It is a process of binding between method call statements and method implementation during compile time is called as Compile Time Polymorphism
	//It is also called as Early binding
	//Its classified into two types : 
	//1.Method Overloading
	//2.Constructor Overloading

	//2.Constructor Overloading
	//If class consist more than one constructor in class block with same class name and different parameters then it is called as Constructor Overloading

public class ConstructorOverloading {
	
	
	ConstructorOverloading()
	{
		System.out.println("ConstructorOverloading()");
	}
	
	ConstructorOverloading(int a)
	{
		System.out.println("ConstructorOverloading(int)");
	}
	
	ConstructorOverloading(char b)
	{
		System.out.println("ConstructorOverloading(char)");
	}
	
	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading();
		ConstructorOverloading obj1=new ConstructorOverloading(20);
		ConstructorOverloading obj2=new ConstructorOverloading('a');
		
	}

}