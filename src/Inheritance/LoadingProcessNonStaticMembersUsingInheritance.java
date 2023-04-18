package Inheritance;
//
//Loading -->  Parent To Child
//Searching -->  Child to Parent
//To load NS members we need to create object of Class
//Child Class will make sure first all the ns members of parent class should be loaded
//Then only it will load its own ns Members
public class LoadingProcessNonStaticMembersUsingInheritance {

	int a=100;
	
	public void test()
	{
		System.out.println("test()-A");
	}
	
	
	{
		System.out.println("IIB-A");
	}
}

class Aa extends  LoadingProcessNonStaticMembersUsingInheritance
{

	int b=20;
	
	public void demo()
	{
		System.out.println("demo()-B");
	}
	
	
	{
		System.out.println("IIB-B");
	}
	
	public static void main(String[] args) {
		
		Aa obj=new Aa();
		System.out.println(obj.b);
		obj.demo();
		System.out.println(obj.a);
		obj.test();
	}
	
}
