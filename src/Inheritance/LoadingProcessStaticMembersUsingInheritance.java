package Inheritance;
//
//Loading -->  Parent To Child
//Searching -->  Child to Parent
//
//Child Class will make sure first all the static members of parent class should be loaded
//Then only it will load its own Static Members
public class LoadingProcessStaticMembersUsingInheritance {

	static int a=100;
	
	public static void test()
	{
		System.out.println("test()-A");
	}
	
	static
	{
		System.out.println("SIB-A");
	}

}

class B extends  LoadingProcessStaticMembersUsingInheritance
{

	static int b=20;
	
	public static void demo()
	{
		System.out.println("demo()-B");
	}
	
	static
	{
		System.out.println("SIB-B");
	}
	
	public static void main(String[] args) {
		System.out.println(b);
		demo();
		System.out.println(a);
		test();
	}
	
}
