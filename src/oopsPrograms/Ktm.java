package oopsPrograms;
//Multilevel inheritance using interface
interface Vehiclee 
{
	void Name();
	void Color();
}

abstract class TwoWeelar implements Vehiclee 
{
	public void Color() 
	{
		System.out.println("My Vehicle Color is Red... ");
	}
}

public class Ktm extends TwoWeelar {
	public void Name()
	{
		System.out.println("My Vehicle Name is KTM... ");
	}
	public static void main(String[] args) {
		Ktm obj = new Ktm();
		obj.Name();
		obj.Color();
		// upcasting from Swift to TwoWeelar
		System.out.println("----------After upcasting from Swift to Vehicle----------------------");
		TwoWeelar tw = obj;
		tw.Name();
		tw.Color();
		// upcasting from TwoWeelar to Vehiclee
		System.out.println("----------After upcasting from TwoWeelar to Vehiclee----------------------");
		Vehiclee v = tw;
		v.Name();
		v.Color();
	}
}
