package Polymorphism;

public class PolymorphismTheory {
	//Polymorphism
	//An object exibits more than one form is called as Polymorphism
	//Polymorphism is classified into two types :
	//1.Compile Time Polymorphism
	//2.Run Time Polymorphism
	
//1.Compile Time Polymorphism
	//It is a process of binding between method call statements and method implementation during compile time is called as Compile Time Polymorphism
	//It is also called as Early binding
	//Its classified into two types : 
	//1.Method Overloading
	//2.Constructor Overloading
	
//2.Run Time Polymorphism	
	//It is process of binding between method call statements and method implementation during runtime is called as Run Time Polymorphism
	//It is also called as late binding
	//Its classified into two types : 
	//1.Derived Type Casting
	//2.Method Overriding
	
	
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
	
		//2.DownCasting
		//It is a process of converting the reference from parent to child class
		//We can not perform downcasting automatically
		//In order to perform downcasting we need to take help of Cast Operator
		//In order to perform downcasting we need to create object for child class such that we can load the members of its own class and child class
		//To do downcasting upcasting is mandatory
	
	//2.Method Overriding
	//Its a process of overriding parent class method implementation by child class method implementation is called as method overriding
	//Rules of perform method overriding:
		//1.There should be Is_a relationship
		//2.Method header of both parent and child class has to be same
		//3.we need to create an object of child class
}
