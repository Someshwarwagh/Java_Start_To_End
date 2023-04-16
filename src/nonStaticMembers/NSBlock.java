package nonStaticMembers;
//NS Block

// A block which is declared inside the class block and Not prefix with static keyword is called as NS Block
// We Can Declared More than one NS Block in class block
//NS block always executed During the memory creation	
//it does not have name so we can not call its executes only ones
//it does not have return type so we can not get return value 
//NS blocks always executes Top to bottom order  

//IIB - Instance initialiser block
//NS block also called as IIB because with the help of NS block we can initialise a NS variables During the memory creation


public class NSBlock {

	int a;
	NSBlock()
	{
		System.out.println("NSBLOCK()");
	}
	
	{
		System.out.println("NSBlock1()");
		a=50; //Initialisation -IIB
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		NSBlock obj=new NSBlock();
		System.out.println(obj.a);
	}
	
	{
		System.out.println("NSBlock2()");
	}
}