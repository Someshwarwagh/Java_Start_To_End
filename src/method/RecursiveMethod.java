package method;

	//Recursive Method
	//Method calling itself is called as recursive method
	//To stop infinite loop we need to take help of base Condition
	//Base condition verifies condition multiple times but execute only ones , this method used to stop the execution and transfer control to calling method

public class RecursiveMethod {
	
	public static void test(int n)
	{
		//called method
		
		System.out.println("test()");
		if(n==5)
		{
			return;
		}
		n++;
		test(n);
		
	}
	
	public static void main(String[] args) {
		
		//calling method
		
		test(0); //MCS-->method call statement
	}
	
	
	
	
	

	
}
