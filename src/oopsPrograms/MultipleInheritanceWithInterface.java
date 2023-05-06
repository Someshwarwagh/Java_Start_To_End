package oopsPrograms;

public class MultipleInheritanceWithInterface  extends A implements C,D 
{

	public void demo() 
	{
		System.out.println("demo()-InterfaceWithSingleInheritance");
	}
	
	public void test() 
	{
		System.out.println("test()-InterfaceWithSingleInheritance");
	}
	
	public static void main(String[] args) {
		MultipleInheritanceWithInterface obj=new MultipleInheritanceWithInterface();
		obj.test();
		obj.demo();
		obj.demo1();
	}
}


class A 
{
	public void demo1() 
	{
		System.out.println("demo1()-A");
	}
}

interface C
{
	void test();
}


interface D
{
	void demo();
}