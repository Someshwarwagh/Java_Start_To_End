package oopsPrograms;

//single inheritance using interface

interface Vehicle
{
	void Name();
}


public class Swift implements Vehicle
{
	public void Name() 
	{
		System.out.println("My Vehicle Name is Swift... ");
	}
	
	public static void main(String[] args) {
		Swift obj=new Swift();
		obj.Name();
		//upcasting from Swift to Vehicle
		System.out.println();
		System.out.println("----------After upcasting from Swift to Vehicle----------------------");
		System.out.println();
		Vehicle vcl=obj;
		vcl.Name();
	}
}


