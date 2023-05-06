package wrapperClasses;

public class UnBoxing_NPDT_To_PDT {

	public static void main(String[] args) {

		//UnBoxing with Static methods
//		Integer obj=100;
//		int a=obj.intValue();
//		
//		Byte obj1=12;
//		byte b=obj1.byteValue();
//		
//		Short obj2=12365;
//		short c=obj2.shortValue();
//		
//		Long obj3=(long) 123456; //not working
//		long d=obj3.longValue();
//		
//		Float obj4=10.25f;
//		float e=obj4.floatValue();
//		
//		Double obj5=125.25;
//		double f=obj5.doubleValue();
//		
//		Character obj6='a';
//		char g=obj6.charValue();
//		
//		Boolean obj7=true;
//		boolean h=obj7.booleanValue();
		
		
		//AutoUnBoxing without Static methods
		
		Integer obj=100;
		int a=obj;
		
		Byte obj1=12;
		byte b=obj1;
		
		Short obj2=12365;
		short c=obj2;
		
		Long obj3=(long) 123456; //not working
		long d=obj3;
		
		Float obj4=10.25f;
		float e=obj4;
		
		Double obj5=125.25;
		double f=obj5;
		
		Character obj6='a';
		char g=obj6;
		
		Boolean obj7=true;
		boolean h=obj7;
		
		
	}
}
