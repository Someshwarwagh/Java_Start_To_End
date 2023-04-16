package nonStaticMembers;

//Constructor it is used to create an object for the class with the help of new keyword
//1.No argument Constructor -->Constructor which does not take any arguments
//2.Parameterised Constructor -->Constructor with arguments
//
//If a programmer fails to declare atleast one constructor inside the class block a 
//	compiler automatically adds one no argument constructor its is called as Default Constructor
//Defualt constructor Not visible to Us

//3.Default Constructor

//No Argument and default both are different constructors
//Default constructor is getting added if no constructor present inside class and no argument adds by Programmer
//If any one no argument or parameterised constructor is present compiler will not add default constructor we will get CTE

//Use Of constructor
//	1.With the help of we can create more than one object for a class with the help of new keyword 
//	2.with help of constructor we can iniialise ns members afer object creation 
//	3.with the help of Constructor we can access both static and non static members

public class ConstructorTypes {

	ConstructorTypes()
	{
		System.out.println("ConstructorTypes()");
	}
	
//	Default Constructor added by Compiler looks like
//	ConstructorTypes()
//	{
//	}
	
	public static void main(String[] args) {
		ConstructorTypes obj=new ConstructorTypes();
		
	}
}
