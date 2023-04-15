package array;

public class ArrayProgram {
	// Array is an continuous type of memory where we can store same(Homogeneous)
	// type of values
	// Array Units Consist default values
	// length
	// Index Value

	// 1.declaration and initialisation
	// 2.using new keyword

	// int[] var OR int var[] --> Both works

	public static void main(String[] args) {
		// 1.declaration and initialisation
		int[] var = { 1, 2, 3, 4, 5 };

		// not alowed
//		int[] var;
//		var={1,2,3,4,5};
		
		//allowed
//		int[] varr=null;
//		System.out.println(var.length);  //Exception

		System.out.println(var);
		System.out.println(var.length);
		System.out.println(var[0]);
		System.out.println(var[1]);
		System.out.println(var[2]);
		System.out.println(var[3]);

		System.out.println("-------------------------");
		
		// 2.using new keyword
		int[] var1=new int[5];
		
		//allowed
//		int[] var1;
//		var1=new int[5];

		
		System.out.println(var1[0]);
		System.out.println(var1[1]);
		var1[0]=10;
		var1[1]=20;
		System.out.println(var1);
		System.out.println(var1.length);
		System.out.println(var1[0]);
		System.out.println(var1[1]);
	}

}
