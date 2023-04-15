package ControlTransferStatement;

public class ReturnKeyword {

	public static void test(int n) {
		System.out.println(n);
		if (n == 5) {
			return;
		}
		n++;
		test(n);
	}

	public static void main(String[] args) {

		// return
		// It is used to stop the execution and transfer the control end of the block
		// and return back to main method
		// return keyword always declared at the end of the block, we can not declared
		// in bet of block otherwise it will give CTE Unreachable statement

		System.out.println("main begin");
		test(0);
		System.out.println("main End");
	}

}
