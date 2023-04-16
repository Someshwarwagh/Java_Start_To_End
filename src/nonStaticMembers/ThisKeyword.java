package nonStaticMembers;

//The This keyword refers to the current object in a method or constructor
//The most common use of this keyword is eliminate the confusion between class attributes and parameters with the same name
//This keyword we can not use in static method , main method or static block
//We can use This keyword in all NS members like NS method, NS block, Constructor
public class ThisKeyword {
	
	int a=20;
	
	public void test()
	{
		System.out.println(a);
		this.a=50;
		System.out.println(this.a);
	}
	
	{
		System.out.println(a);
		this.a=60;
		System.out.println(this.a);
	}	
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword();
		obj.test();
	}
}
