package wrapperClasses;

public class Boxing_PDT_To_NPDT {

	//Wrapper Classes
	//convert from primitive datatype into non primitive datatypes
	//wrapper classes present in java.lang package
	//All wrapper classes are final
	//All wrapper classes extends with Object class and implements with Comparable, Serializable Interface
	//we can create objects for wrapper classes in two ways: 1. Using Assignment operator  2. using new keyword
	
	
	//Boxing 
	//Convert from PDT into NPDT is called as Boxing
	//valueOf() need to convert PDT into NPDT but not mandatory
	//Autoboxing is possible  - without valueOf() 
	

	public static void main(String[] args) {

		//Boxing with valueOf()
//		int a=100;
//		Integer obj=Integer.valueOf(a);
//		
//		byte b=12;
//		Byte obj1=Byte.valueOf(b);
//		
//		short c=12365;
//		Short obj2=Short.valueOf(c);
//		
//		long d=100000000;
//		Long obj3=Long.valueOf(d);
//		
//		float e=10.25f;
//		Float obj4=Float.valueOf(e);
//		
//		double f=125.25;
//		Double obj5=Double.valueOf(f);
//		
//		char g='a';
//		Character obj6=Character.valueOf(g);
//		
//		boolean h=true;
//		Boolean obj7=Boolean.valueOf(h);
//		
		
		//AutoBoxing without valueOf()
		int a=100;
		Integer obj=a;
		
		byte b=12;
		Byte obj1=b;
		
		short c=12365;
		Short obj2=c;
		
		long d=100000000;
		Long obj3=d;
		
		float e=10.25f;
		Float obj4=e;
		
		double f=125.25;
		Double obj5=f;
		
		char g='a';
		Character obj6=g;
		
		boolean h=true;
		Boolean obj7=h;
		
		
	}
}
