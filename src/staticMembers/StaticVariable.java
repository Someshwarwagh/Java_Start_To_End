package staticMembers;

public class StaticVariable {
	public static void main(String[] args) {
		// Static Variable
		// A variable which is declared inside the class block and prefix with static keyword is called as static variable
		// We Can Declared More than one Static variables in class block
		// Static variable consist default values
		// we can access static variable for printing or initialising the value
		
		// If class consist both static and local variable with same name after declaration of local variable if we try to access directly then compiler
		//      always give first priority to local variable first on such a case we need to take help of class name as reference to access static variable
		
		// we can access static variable from one class to another class with the help of class name as reference		

		// We can access Static variables in two ways
		// 1.directly by its variable name
		// 2.class name as reference	
		
		
		System.out.println("--------------------");
		System.out.println(V.a); //from one class to another access with class name as reference
		V.a=23; //initialisation one class to another
		System.out.println(V.a);
		System.out.println(V.b); //from one class to another access with class name as reference
		
		
	}
}
class V
{
	static int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		System.out.println(a); // directly printing
		a=50; //directly initialisation
		System.out.println(a);
		
		System.out.println(V.a); // With the help of Class name as a reference printing
		V.a=20; //With the help of Class name as a reference initialisation
		System.out.println(V.a);
		
		System.out.println("----------------");
		
		System.out.println(b);
		int b=40; //local variable
		System.out.println(b); //40
		//Searching process
		//1.local variable present or not inside the block before line
		//2.If not present search from static variable in class block 
		
		System.out.println(V.b);//if we want to access global static variable we need to use class name as reference 
		//Indirectly it will ignore all local variables it will not search for local
		
		
		
		
	}
}