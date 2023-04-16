package nonStaticMembers;

public class NSMethod {
	public static void main(String[] args) {
		// NS Method
		// A Method which is declared inside the class block and Not prefix with static keyword is called as NS Method
		// We Can Declared More than one NS Method in class block
		// NS Method Can be no argument or parameterised
		
		//IMP
		//If return type is void we can not call method in printing statement or we can not store the method value
		
		// we can access NS Method from one class to another class with the help of Object reference variable

		M obj=new M();
		obj.test(); //one class to another class  access with the help of Object reference variable
	}
}
class M
{	
	public void test() 
	{
		System.out.println("test()-M");
	}
	public void test1() 
	{
		System.out.println("test1()-M");
		test();
		this.test();
	}
	{
		System.out.println("NSBlock-M");
		test();
		this.test();
	}
	public static void main(String[] args) {
		M obj1=new M();
		obj1.test1(); //with the help of ORV
	}
}