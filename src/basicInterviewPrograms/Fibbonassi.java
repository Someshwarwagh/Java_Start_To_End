package basicInterviewPrograms;
public class Fibbonassi 
{
	int n = 2;
	int n1=0,n2=1,n3=0;
	public void Fibbo(int num) 
	{
		while(n<num) 
		{
			n3 = n1 + n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			Fibbo(++n);
		}
	}

	public static void main(String[] args) 
	{
		Fibbonassi obj = new Fibbonassi();
		System.out.print(obj.n1+" "+obj.n2);
		obj.Fibbo(10);
	}

}
