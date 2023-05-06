package Abstraction;

//Abstraction

//Abstraction its a process of hiding implementation
//we can perform abstraction with the help of abstract keyword
//To hid the implementation we need to take help of methods
//Method Consists:
//	1.method header
//	2.method body

//Abstract Method

//A ns method declared inside the class block terminated with semicolan and prefix with abstract keyword is called as abstract method
//wecan declared more than one abstract methods inside class block only not with same name and same arguments
 //Syntax : 
		//abstract accessmodifier returntype methodname(arguments);


//Abstract Class

//A class which prefix with abstract keyword is called as abstract class
//If class consist atleast one abstract method then it is mandatory to make class abstract
//abstract class can be without abstract method
//abstract class can have only concrete methods
//we can not make abstact methods static only for ns methods available


//Concrete methods

//The method which consist implementation is called as Concrete method
//IMP Points: 
//Can we declare both abstract and concrete methods inside abstract class-----> Yes we can declare
//Can we declare only concrete methods inside abstract class-----> Yes we can declare
//Can we create object of abstract class-----> No we can not Create
//Can we create object reference variable of abstract class-----> Yes we can create



abstract public class AbstractionDemo 
{
	abstract public void demo();
	
	public void test() //ns-concrete method
	{
		System.out.println("ns-concrete method-test()");
	}
	
	public static void test1() //static-concrete method
	{
		System.out.println("static-concrete method-test1()");
	}
	
	public static void main(String[] args) {
		//AbstractionDemo obj=new AbstractionDemo(); //CTE
		AbstractionDemo obj; //possible object reference variable of abstract class
	}

}
