package DecisionMakingStatements;

public class TypesOfDMS {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		/*
		 DMS : DMS are use to check the condition before performing task. 
		 There are 5 Types of DMS
		 1.if Statement
		 2.if else 
		 3.else if ladder
		 4.nested if
		 5.switch
		 	-Inside switch we can pass expression or literals, we can not pass condition
		 	-To Stop the Switch we need to use break keyword, Continue Keyword
		 */
		System.out.println("if------------------------------------------");
		if(a>b)
			System.out.println("Yes");
		System.out.println("No");
		
		System.out.println("if else------------------------------------------");
		if (a>b) {
			System.out.println("a is greater : "+ a);
		} else {
			System.out.println("b is greater : "+ b);
		}
		
		System.out.println("else if ladder------------------------------------------");
		if (a==b) 
		{
			System.out.println("a and b are same");
		}
		else if(a==10)
		{
			System.out.println("a is greater : "+ a);
		}
		else 
		{
			System.out.println(b);
		}
		
		
		System.out.println("nested if------------------------------------------");
		if(a==10)
		{
			if (a>b) {
				System.out.println(a);
			}
			else {
				System.out.println(b);
			}
		}
		
		
		System.out.println("Switch------------------------------------------");
		switch (a%2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;

		default:
			System.out.println("No Matches");
			break;
		}
		
	}

}
