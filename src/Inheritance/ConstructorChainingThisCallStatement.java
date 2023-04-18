package Inheritance;

//Its a Process of one constructor calling another constructor is called as Constructor chaining

//Constructor chaining classified into two types : 
//	1. Super Call Statement (super())
//	2.This Call Statement (this())

//2.This Call Statement (super())
//This Call stateent is used to call the constructor of its own class
//This Call stateent should always declared as first statement inside the constructor
//We can not declared This call statement in between the constructor otherwiese we will get CTE
//Compiler will not add this() statement automatically we need to give it


//Constructor Invocation :
//	Constructor calling process from child to parent
//	
//Constructor Execution : 
//	
//	Constructor Execution process from Parent to Child


public class ConstructorChainingThisCallStatement
{

	ConstructorChainingThisCallStatement()
	{
		System.out.println("ConstructorChainingSuperCallStatement()-A");
	}
	
	ConstructorChainingThisCallStatement(int a)
	{
		super();//Not Mandetory for no arument constructor Compiler add automatically
		System.out.println("ConstructorChainingSuperCallStatement()-A - a");
	}
	public static void main(String[] args) {

	
	}
}

class Y extends ConstructorChainingThisCallStatement
{

	Y()
	{
		this(20,30);// Mandetory Compiler not add automatically
		//calling constructor of own class
		System.out.println("Y()");
	}
	Y(int a)
	{
		super(20);// Mandetory for only parameterised 
		System.out.println("Y(int)");
	}
	Y(char a)
	{
		super();// Mandetory Compiler not add automatically
		System.out.println("Y(char)");
	}
	Y(int a,int b)
	{
		this(15);// Mandetory Compiler not add automatically
		//calling constructor of own class
		System.out.println("Y(int,int)");
	}
	
	
	public static void main(String[] args) {

		Y obj=new Y();
		System.out.println("------------------");
		Y obj1=new Y('a');
	}

}
