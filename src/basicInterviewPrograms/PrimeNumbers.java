package basicInterviewPrograms;
public class PrimeNumbers 
{
	int count = 0;

	public void primeNum(int num) 
	{
		for (int i = 1; i < 30; i++) {
			if(num%i==0)
			{
				count++;
			}
		}
		
		if (count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
	}

	public static void main(String[] args) 
	{
		PrimeNumbers obj = new PrimeNumbers();
		obj.primeNum(13);
	}

}
