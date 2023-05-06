package oopsPrograms;
//Hierarical inheritance using interface
interface Vehicle1 
{
	void Name();
}

class TwoWeel implements Vehicle1 
{
	public void Name()
	{
		System.out.println("Name()-TwoWeel");
	}

}

public class FourWeel implements Vehicle1 {

	public void Name() 
	{
		System.out.println("Name()-FourWeel");
	}
	
	public static void main(String[] args) {
	
		FourWeel fw=new FourWeel();
		fw.Name();
		System.out.println("Upcasting from FourWeel to Vehicle1");
		Vehicle1 v1=fw;
		fw.Name();
		System.out.println("-------------------------------------------");
		TwoWeel tw=new TwoWeel();
		tw.Name();
		System.out.println("Upcasting from TwoWeel to Vehicle1");
		Vehicle1 v2=tw;
		v2.Name();
		
	}

}
