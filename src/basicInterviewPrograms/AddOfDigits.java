package basicInterviewPrograms;
public class AddOfDigits 
{
	int sum = 0;

	public void Sum(int num) 
	{
		if(num!=0)
		{
			sum = sum + num%10;
			num = num/10;
			Sum(num);
		}	
		else
		{
			System.out.println(sum);	
		}	
	}

	public static void main(String[] args) 
	{
		AddOfDigits obj = new AddOfDigits();
		obj.Sum(1457);
	}

}
