package staticMembers;
//Static Block

// A block which is declared inside the class block and prefix with static keyword is called as static Block
// We Can Declared More than one Static Block in class block
//static block always executed before execution of main method begins	
//it does not have name so we can not call its executes only ones
//it does not have return type so we can not get return value 
//Static blocks always executes Top to bottom order  

//SIB - static initialiser block
//Static block also called as SIB because with the help of Static block we can initialise a static variables before the execution of main method begins


public class StaticBlock {

	static int a;
	static 
	{
		a=50; //Initialisation -SIB
		System.out.println("StaticBlock()");
	}

	public static void main(String[] args) {
		System.out.println(a);
	}
}