//121-->121  Palindrome
//152-->251 not a palindrome

package basicInterviewPrograms;

public class PalindromeNumber {

	public void palindromNum(int n) {
		int temp=n;
		int rem=0;
		int res=0;
		while(n!=0)
		{
			rem = n % 10;
			res =  (res*10) + rem;
			n = n / 10;
		}
		if(res==temp)
		{
			System.out.println("Palindrome Number");
			
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
		
	}

	public static void main(String args[]) {
		PalindromeNumber obj = new PalindromeNumber();
		obj.palindromNum(121);
	}
}
