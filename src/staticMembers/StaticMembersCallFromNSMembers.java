package staticMembers;

public class StaticMembersCallFromNSMembers {

	static int a=10;
	public static void print()
	{
		System.out.println("static print()");
	}
	
	StaticMembersCallFromNSMembers()
	{
		System.out.println(a);
		System.out.println(StaticMembersCallFromNSMembers.a);
		System.out.println(this.a);
		print();
		StaticMembersCallFromNSMembers.print();
		this.print();
	}
	StaticMembersCallFromNSMembers(int n)
	{
		a=n;
		System.out.println(a);
		System.out.println(StaticMembersCallFromNSMembers.a);
		System.out.println(this.a);
		print();
		StaticMembersCallFromNSMembers.print();
		this.print();
	}
	
	{
		nsMethod();
		System.out.println(a);
		System.out.println(StaticMembersCallFromNSMembers.a);
		System.out.println(this.a);
		print();
		StaticMembersCallFromNSMembers.print();
		this.print();
	}
	
	public void nsMethod()
	{
		System.out.println("From NS-Method");
		System.out.println(a);
		System.out.println(StaticMembersCallFromNSMembers.a);
		System.out.println(this.a);
		print();
		StaticMembersCallFromNSMembers.print();
		this.print();
		
	}
	
	
	public static void main(String[] args) {
	
		StaticMembersCallFromNSMembers obj=new StaticMembersCallFromNSMembers();
		StaticMembersCallFromNSMembers obj1=new StaticMembersCallFromNSMembers(20);
	}

}
