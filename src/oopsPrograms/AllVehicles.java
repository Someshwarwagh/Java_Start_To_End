package oopsPrograms;
//Hybrid inheritance using interface
interface Vehicleee 
{
	void twoWeel();
}
abstract class TwoWeelaar implements Vehicleee 
{
	public void twoWeel() 
	{
		System.out.println("twoWeel()-TwoWeelaar");
	}
}
interface FourWeelar extends Vehicleee
{
	void fourWeel();
}
public class AllVehicles extends TwoWeelaar implements  FourWeelar
{
	public void fourWeel()
	{
		System.out.println("fourWeel()-AllVehicles");
	}
	
	public static void main(String[] args) 
	{
		AllVehicles obj = new AllVehicles();
		obj.fourWeel();
		obj.twoWeel();
		System.out.println("Upcast from AllVehicles to TwoWeelaar");
		System.out.println();
		TwoWeelaar tw=obj;
		obj.fourWeel();
		obj.twoWeel();
		System.out.println("Upcast from AllVehicles to FourWeelar");
		System.out.println();
		FourWeelar fw=obj;
		fw.fourWeel();
		fw.twoWeel();
		System.out.println("Upcast from TwoWeelaar to Vehicleee");
		System.out.println();
		Vehicleee v1=tw;
		v1.twoWeel();
		System.out.println("Upcast from FourWeelar to Vehicleee");
		System.out.println();
		Vehicleee v2=fw;
		v2.twoWeel();		
	}
}
