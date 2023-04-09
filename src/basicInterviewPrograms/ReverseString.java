package basicInterviewPrograms;

public class ReverseString 
{
	public void revString(String str)
	{
		String rev=" ";
		for (int i = 0; i < str.length(); i++) 
		{			
			rev = str.charAt(i) + rev;
			
		}
		System.out.println(rev);
	}
	
	
	public static void main(String[] args) 
	{
		ReverseString obj = new ReverseString();
		obj.revString("My Name is Someshwar");
	}

}
