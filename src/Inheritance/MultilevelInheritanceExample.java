package Inheritance;
class Student1 {
	int a = 20;
	String name = "Ramesh";

	public void std1Data() {
		System.out.println("My roll No is : " + a);
		System.out.println("My name is : " + name);
	}
	
	Student1()
	{
		System.out.println("Student1 Constructor");
	}
}
class Student2 extends Student1
{
	int a = 21;
	String name = "Suresh";

	public void std2Data() {
		System.out.println("My roll No is : " + a);
		System.out.println("My name is : " + name);
	}
	
	Student2()
	{
		System.out.println("Student2 Constructor");
	}
}

public class MultilevelInheritanceExample extends Student2 {
	
	public void collegeName()
	{
		System.out.println("Angel Junior College");
	}
	
	MultilevelInheritanceExample()
	{
		System.out.println("MultilevelInheritanceExample Constructor");
	}
	
	public static void main(String[] args) {
		MultilevelInheritanceExample obj1=new MultilevelInheritanceExample();
		System.out.println("-------------------------");
		obj1.std1Data();
		System.out.println("-------------------------");
		obj1.std2Data();
	}

}
