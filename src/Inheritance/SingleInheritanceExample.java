package Inheritance;

class Student {
	int a = 20;
	String name = "Ramesh";

	public void myData() {
		System.out.println("My roll No is : " + a);
		System.out.println("My name is : " + name);
	}
	
	Student()
	{
		System.out.println("Parent Constructor");
	}
}
public class SingleInheritanceExample extends Student {
	
	public void collegeName()
	{
		System.out.println("Angel Junior College");
	}
	SingleInheritanceExample()
	{
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		SingleInheritanceExample obj=new SingleInheritanceExample();
		obj.collegeName();
		obj.myData();
	}

}
