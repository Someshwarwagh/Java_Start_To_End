package method;

//Method
	//It is the set of instructions to perform a particular task
	// Method Header -->   [AccessModifier][ReturnType][MethodName](FormalParameters)
	// Method Signature -->  MethodName(FormalArguments)	
	
	//Method Call Statements
	//It is a process of transfering the control from calling method to called method
	
	//1. Calling Method : A method tries to call another method is called as Calling method
	//2. Called Method : The method which is under execution is called as Called Method
	//3. Return Type : It is the process of transferring the control from called method back to the calling method it is called as return type
	
	//We can return primitive and non primitive values
	//if we return void it does not return anything but still we can give return keyword in void method
	//if method not returning anything we can not store or call method from printing statement it will give CTE
	
	//IMP
	//If return type is void we can not call method in printing statement or we can not store the method value


public class MethodProgram {
	
	public static void test()
	{
		//called method
		System.out.println("test()");
		return; //--> Possible to give return keyword in void method
	}
	
	public static void main(String[] args) {
		
		//calling method
		
		test(); //MCS-->method call statement
	}
	
	
	
	
	

	
}
