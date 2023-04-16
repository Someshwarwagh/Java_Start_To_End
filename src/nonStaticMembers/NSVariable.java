package nonStaticMembers;

public class NSVariable {
	public static void main(String[] args) {
		// NS Variable
		// A variable which is declared inside the class block and Not prefix with static keyword is called as NS variable
		// We Can Declared More than one NS Static variables in class block
		// NS Static variable consist default values
		// we can access NS static variable for printing or initialising the value
		
		// If class consist both NS static global and local variable with same name after declaration of local variable if we try to access directly then compiler
		//      always give first priority to local variable first on such a case we need to take help of class name as reference to access static variable
		
		// we can access static variable from one class to another class with the help of class name as reference	
		
		
		//Method block searching Process
				//1.Local variables search first
				//2.Then for Static Variable 
				//3.Then for NS-variable , if not found CTE
		
		V obj1=new V();
		
		System.out.println("--------------------");
		System.out.println(obj1.a); //from one class to another access with class name as reference
		obj1.a=23; //initialisation one class to another
		System.out.println(obj1.a);
		System.out.println(obj1.b); //from one class to another access with class name as reference
		
		
	}
}
class V
{
	 int a=10;
	 int b=20;
	 V()
	 {
		 System.out.println("V()");
	 }
	
	public static void main(String[] args) {
		V obj=new V();
		
		System.out.println(obj.a); //With the help of ORV printing
		obj.a=50; //With the help of ORV initialisation
		System.out.println(obj.a);
		
		System.out.println("----------------");
		
		System.out.println(obj.b);
		int b=40; //local variable
		System.out.println(b); //40
		//Searching process
		//1.local variable present or not inside the block before line
		//2.If not present search from static variable in class block 
		
		System.out.println(obj.b);//if we want to access global NS variable we need to use Object reference Variable
		//Indirectly it will ignore all local variables it will not search for local
		
	}
}