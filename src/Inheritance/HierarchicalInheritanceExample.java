package Inheritance;
class Student3 extends HierarchicalInheritanceExample
{
	int a = 20;
	String name = "Ramesh";

	public void std1Data() {
		System.out.println("My roll No is : " + a);
		System.out.println("My name is : " + name);
	}
	
	Student3()
	{
		System.out.println("Student3 Constructor");
	}
}
class Student4 extends HierarchicalInheritanceExample
{
	int a = 21;
	String name = "Suresh";

	public void std2Data() {
		System.out.println("My roll No is : " + a);
		System.out.println("My name is : " + name);
	}
	
	Student4()
	{
		System.out.println("Student4 Constructor");
	}
}

public class HierarchicalInheritanceExample {
	
	public void collegeName()
	{
		System.out.println("Angel Junior College");
	}
	
	HierarchicalInheritanceExample()
	{
		System.out.println("HierarchicalInheritanceExample Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("-------------------------");
		Student3 obj1=new Student3();
		obj1.collegeName();
		obj1.std1Data();
		
		System.out.println("-------------------------");
		Student4 obj2=new Student4();
		obj1.collegeName();
		obj2.std2Data();
	}

}
