package ControlTransferStatement;

public class BreakKeyword {
	
	
	public void test()
	{
		int n=0;
		while (n<5) {
			System.out.println(n);
			if(n==2)
			{
				System.out.println("If Block");
				n++;
				break;
			}
			System.out.println(n);
			n++;
		}
		
		System.out.println("hi");
	}

	public static void main(String[] args) {
		//Break
		//It is used to stop the execution and transfer the control end of the block and not return back to main method
		//Break keyword always declared at the end of the block, we can not declared in bet of block otherwise it will give CTE Unreachable statement
		BreakKeyword obj=new BreakKeyword();
		
		System.out.println("main begin");
		obj.test();
		System.out.println("main End");

	}

}
