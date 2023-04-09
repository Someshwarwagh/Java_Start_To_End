package basicInterviewPrograms;
public class Factorial 
{
	int fact = 1;

	public void Sum(int num) 
	{
		if (num>0) 
		{
			fact=fact * num--;
			Sum(num);
		}
		else 
		{
			System.out.println(fact);
		}
	}

	public static void main(String[] args) 
	{
		Factorial obj = new Factorial();
		obj.Sum(5);
	}

}
