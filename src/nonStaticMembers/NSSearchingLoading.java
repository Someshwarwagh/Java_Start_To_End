package nonStaticMembers;

public class NSSearchingLoading {
public static void main(String[] args) {
		//Loading Process Of Non-Static Members
		//Allocated Memory For NS Members------->  Heap Area
		
		//For all the NS members compiler not allocates memory automatically
		//For all NS members we need to create an object for the entire class
		//Before creating object we need to create object reference variable to store the address of object of entire class
		//In order to create an object we need to take help of Constructor
	
	
		//1.One Object created Constructor will get call but before executing constructor it will make sure :
//		    -All NS Variables get loaded
//		    -All NS methods get loaded
//		    -All NS blocks get Executes in top to bottom order
//		Then Constructor get executed
//		And this will happen for every each object creation
		
		
		// ---> Accesing Ways From different NS Members For NS Variables
		//1.From Own Class NS method  			-Directly
		//								  		-Using this Keyword
		
		//2.From Own Class NS Block   			-Directly
		//								  		-Using this Keyword
		
		//3.From Another Class NS method  		-with the help of object reference variable
		
		//4.From Another Class NS Block			-with the help of object reference variable
		
		
		
		// ---> Accesing Ways From different static Members For Static Methods
		//1.From Own Class Static method  		-Directly
		//								  		-Using this Keyword
			
		//2.From Own Class Static Block   		-Directly
		//								  		-Using this Keyword
			
		//3.From Another Class Static method  	-with the help of object reference variable
			
		//4.From Another Class Static Block		-with the help of object reference variable
		
}
}
