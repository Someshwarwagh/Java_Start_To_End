package basicInterviewPrograms;

public class RemoveDigitsFromString 
{
	public void revString(String str)
	{
		String num=" ";
		
		//1st Way to perform
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num = num + str.charAt(i);
			}
		}
		
		//2nd way to perform
		/*char[] character= str.toCharArray(); 
		for (int i = 0; i < character.length; i++) 
		{		
			if(!Character.isDigit(character[i])) 
			{
				num = num + str.charAt(i);
			}
		}*/
		
		System.out.println(num);
	}
	
	
	public static void main(String[] args) 
	{
		RemoveDigitsFromString obj = new RemoveDigitsFromString();
		obj.revString("My Name 45 is 85 Somes25hwar");
	}

}
