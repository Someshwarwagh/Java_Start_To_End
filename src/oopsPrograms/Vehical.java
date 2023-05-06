package oopsPrograms;
//Multiple inheritance using interface
interface TwoWeeler 
{
	void T_Type();
}
interface FourWeeler 
{
	void F_Type();
}

public class Vehical implements TwoWeeler,FourWeeler
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
	
		Vehical obj=new Vehical();
		obj.F_Type();
		obj.T_Type();	
	}

}
