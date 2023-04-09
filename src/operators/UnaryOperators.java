package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int a=10;
		/*
		
		Unary Operators : The Operators which takes only on value at a time
		1.Increment
			-Post Increment --> use the value first then increment value by one
			-Pre Increment  --> increment value by one then use the updated value   
		2.Decrement
			-Post Decrement --> use the value first then Decrement value by one
			-Pre Decrement  --> Decrement value by one then use the updated value  
		3.Cast Operator		--> It takes only one value at a time and it is using for narrowing Operator -> ( )
		
		*/
		
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
	}

}
