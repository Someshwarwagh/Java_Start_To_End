package Polymorphism;
//1.Compile Time Polymorphism
	//It is a process of binding between method call statements and method implementation during compile time is called as Compile Time Polymorphism
	//It is also called as Early binding
	//Its classified into two types : 
	//1.Method Overloading
	//2.Constructor Overloading

	//1.Method Overloading
	//If class consist more than one methods in class block with same name and different parameters then it is called as Method Overloading

public class MethodOverloading {
	
	
	public void test()
	{
		System.out.println("test()");
	}
	
	public void test(int a)
	{
		System.out.println("test(int)");
	}
	
	public void test(char b)
	{
		System.out.println("test(char)");
	}
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.test();
		obj.test(20);
		obj.test('a');
		
	}

}