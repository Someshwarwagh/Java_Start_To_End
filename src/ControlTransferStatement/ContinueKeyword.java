package ControlTransferStatement;

public class ContinueKeyword {



	public static void main(String[] args) {
		//Continue
		//It is used to stop the execution and transfer the control Beginning of the loop
		//Continue keyword always declared at the end of the block, we can not declared in bet of block otherwise it will give CTE Unreachable statement
		System.out.println("main begin");
		int n=0;
		while (n<5) 
		{
			System.out.println(n);
			if(n==2)
			{
				System.out.println("If Block");
				n++;
				continue;
			}
			System.out.println(n);
			n++;
		}
		System.out.println("main End");
}
}
