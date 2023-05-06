package wrapperClasses;

public class StringToPDT {
	
	public static void main(String[] args) {

		//String to PDT
		String obj="100";
		int a=Integer.parseInt(obj); 
		
		String obj1="123";
		byte b=Byte.parseByte(obj1); 
		
		String obj2="12365";
		short c=Short.parseShort(obj2); 
		
		String obj3="100000000";
		long d=Long.parseLong(obj3);
		
		String obj4="10.25f";
		float e=Float.parseFloat(obj4);
		
		String obj5="125.25";
		double f=Double.parseDouble(obj5); 
		
//		String obj6="a";         // For Character Unboxing from String to PDT not working
//		char g=Character.pars(obj6);   
		 
		String obj7="true";
		boolean h=Boolean.parseBoolean(obj7);

		
		
	}
}
