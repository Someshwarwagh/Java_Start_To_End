package nonStaticMembers;

//If class consist more than one constructor with same class name and different arguments then it is called as Constructor Overloading


public class ConstructorOverloading {

	ConstructorOverloading()
	{
		System.out.println("ConstructorTypes()");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("ConstructorTypes() : "+ a);
	}
	
//	Default Constructor added by Compiler looks like
//	ConstructorTypes()
//	{
//	}
	
	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading();
		ConstructorOverloading obj1=new ConstructorOverloading(10);
		
	}
}
