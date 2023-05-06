package oopsPrograms;
//DownCasting using interface
interface TwoWeeler1 
{
	void T_Type();
}
interface FourWeeler1 
{
	void F_Type();
}

public class Downcast implements TwoWeeler1,FourWeeler1
{
	public void F_Type()
	{
		System.out.println("F_Type()-Vehical");
	}

	public void T_Type()
	{
		System.out.println("T_Type()-Vehical");
	}
	public static void main(String[] args) {
	
		//upcasting
		TwoWeeler1 tw=new Downcast();
		tw.T_Type();	
		//upcasting
		FourWeeler1 fw=new Downcast();
		fw.F_Type();
		//downcasting
		Downcast dw=(Downcast)tw;
		dw.T_Type();
		dw.F_Type();
		
	}

}
