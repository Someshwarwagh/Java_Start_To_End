package operators;

public class BinaryOperators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		/*
		
		Unary Operators : The Operators which takes minimum two values at a time
		1.Relational  
			-The output type of Relational operators is Boolean Condition(true or false)  
			- <, >, <=, >=
		2.logical
		 	-AND  &&
		 	-OR   ||
		 	-NOT  !    -->NOT is unary operator
		3.Arithmetic
			- +, -, *, /, % 
		
		*/
		System.out.println("--------------------------------------------");
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println("--------------------------------------------");
		System.out.println(a<b && 5<10);
		System.out.println(a<b || 5<10);
		System.out.println(a!=b);
		System.out.println("--------------------------------------------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a%b);
		
	}

}
