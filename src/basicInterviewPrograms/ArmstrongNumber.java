//153--> (1*1*1) + (5*5*5) + (3*3*3) --> 153  

package basicInterviewPrograms;

public class ArmstrongNumber {

	public void isArmstrong(int n) {
		int temp = n;
		int rem = 0;
		int res = 0;
		while (n != 0) {
			rem = n % 10;
			res = res + (rem * rem * rem);
			n = n / 10;
		}
		if(res==temp)
		{
			System.out.println("Armstrong Number");
			
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}

	public static void main(String args[]) {
		ArmstrongNumber obj = new ArmstrongNumber();
		obj.isArmstrong(153);
	}
}
