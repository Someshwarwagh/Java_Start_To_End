package loopingStatements;

import java.util.Iterator;

public class TypesOfLoopingStatements {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		
		/*
		 Looping Statements :
		 -looping statements we use to verify a condition multiple times
		 Types of looping statements
		 1.while loop
		 	-if condition true then only enter inside loop
		 2.do while loop
		 	--Condition Might be true or false ones it will go inside loop
		 3.for loop
		 	-if condition true then only enter inside loop
		 
		 */
		System.out.println("While loop------------------------------");
		int n=0;
		while(a>n)
		{
			System.out.println(n++);
		}
		
		System.out.println("do While loop------------------------------");
		int n1=0;
		do
		{
			System.out.println(n1++);
		}
		while(b>n1);
		
		
		System.out.println("For loop------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}

}
