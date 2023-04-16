package staticMembers;

public class StaticMethod {
	public static void main(String[] args) {
		// Static Method
		// A Method which is declared inside the class block and prefix with static keyword is called as static Method
		// We Can Declared More than one Static Method in class block
		// Static Can be no argument or parameterised
		
		//IMP
		//If return type is void we can not call method in printing statement or we can not store the method value
		
		// we can access static Method from one class to another class with the help of class name as reference		

		// We can access Static Method in two ways
		// 1.directly by its Method name
		// 2.class name as reference	
		
		
		//Method block searching Process
		//1.Local variables search first
		//2.Then for Static Variable , if not founnd CTE
		
		
		
		
		M.test(); //one class to another class  access with the help of class name as reference	
	}
}
class M
{	
	public static void test() 
	{
		System.out.println("test()-M");
	}
	public static void test1() 
	{
		System.out.println("test1()-M");
		test();
		M.test();
	}
	static
	{
		System.out.println("StaticBlock-M");
		test();
		M.test();
	}
	public static void main(String[] args) {	
		test(); //directly by its Method name
		M.test(); //class name as reference	
	}
}