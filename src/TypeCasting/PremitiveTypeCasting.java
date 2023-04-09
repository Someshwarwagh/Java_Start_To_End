package TypeCasting;

public class PremitiveTypeCasting {

	public static void main(String[] args) {
		/*
		Primitive Type Casting
		It is a process of converting one primitive dataType into another 
		primitive data type is called as Primitive Type Casting.
		1.Widening
		2.Narrowing
		*/
		
		
		/*1. Widening
		Definition-> 
		-It is a process of converting smallest primitive dataType into largest 
		  primitive data type is called as widening
		-Also called as Auto Widening  
		byte  -->
		char  -->  int --> long --> float --> double  
		short -->
		*/
		char a='A';
		int n=a;	
		int n1=124;
		float f=n1;	
		float f1=12.30f;
		double d=f1;
		long l=123654;
		double d1=l;
		System.out.println("Widening--------------------------------");
		System.out.println(n);
		System.out.println(f);
		System.out.println(d);
		System.out.println(d1);
		
		
		
		/*2. Narrowing
		Definition-> 
		-It is a process of converting largest primitive dataType into smallest 
		  primitive data type is called as Narrowing
		-Narrowing is not Automate Process
		-We need to take help of Cast Operator 
		byte  <--
		char  <--  int <-- long <-- float <-- double  
		short <--
		*/		
		double d2=123.258;
		int n2=(int)d2;	
		float f2=124.25f;
		char c=(char)f2;
		int n3=125;
		char c1=(char)n3;
		
		System.out.println("Narrowing--------------------------------");
		System.out.println(n2);
		System.out.println(c);
		System.out.println(c1);
	}

}
