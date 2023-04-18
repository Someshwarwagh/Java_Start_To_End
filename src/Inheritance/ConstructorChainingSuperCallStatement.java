package Inheritance;

//Its a Process of one constructor calling another constructor is called as Constructor chaining

//Constructor chaining classified into two types : 
//	1. Super Call Statement (super())
//	2.This Call Statement (this())
//
//	
//1.Super Call Statement (super())
//Super Call stateent is used to call the constructor of its parent class
//Super Call stateent should always declared as first statement inside the constructor
//We can not declared super call statement in between the constructor otherwiese we will get CTE
//If we not give Super() inside the constructor compiler will add automatically first statement as Super()


//Constructor Invocation :
//	Constructor calling process from child to parent
//	
//Constructor Execution : 
//	
//	Constructor Execution process from Parent to Child


//Important : 
//	-If parent class consist parameterised constructor and to call this constructor from child class writting super() and 
//		passing value is mandatory inside the child class constructor
//		
//		Example : 
//			Parent class having parameterised constructor
//			ConstructorChainingSuperCallStatement(int a)
//			{
//				System.out.println("Parameterised");
//			}
//
//			then from child class constructor super(20) is mandatory with passing value
 

public class ConstructorChainingSuperCallStatement {

	int a = 100;

	public void test() {
		System.out.println("test()-A");
	}

	{
		System.out.println("IIB-A");
	}
	
	ConstructorChainingSuperCallStatement()
	{
		super();;//Not Mandetory for no arument constructor Compiler add automatically
		System.out.println("ConstructorChainingSuperCallStatement()-A");
	}
}

class X extends ConstructorChainingSuperCallStatement {
	int b = 20;

	public void demo() 
	{
		System.out.println("demo()-X");
	}

	{
		System.out.println("IIB-X");
	}

	X()
	{
		super();//Not Mandetory Compiler add automatically
		System.out.println("X()");
	}
	
	public static void main(String[] args) {

		
	}

}
