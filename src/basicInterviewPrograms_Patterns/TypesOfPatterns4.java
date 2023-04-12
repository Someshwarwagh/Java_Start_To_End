package basicInterviewPrograms_Patterns;

// *		*****		*		*****		*							* 
// **		****	   **		 ****		* * 					  *	*
// ***		***		  ***		  ***		* * *				    * *	*
// ****		**		 ****		   **		* * * *			      *	* *	*
// *****	*		*****			*		* * * * *	        * *	* *	*
//											* * * *			      *	* *	*
//											* * * 				    * *	*
//											* *						  *	*
//											*							*

public class TypesOfPatterns4 {

	public static void main(String[] args) {

		// 1.
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 2.
		for (int r = 1; r <= 5; r++) {
			for (int c = 5; c >= r; c--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 3.
		for (int r = 1; r <= 5; r++) {
			for (int c = 4; c >= r; c--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= r; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 4.
		for (int r = 1; r <= 5; r++) {
			for (int k = 2; k <= r; k++) {
				System.out.print("  ");
			}
			for (int c = 5; c >= r; c--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 5.
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int r = 1; r <= 4; r++) {
			for (int c = 4; c >= r; c--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 6.
		for (int r = 1; r <= 5; r++) {
			for (int c = 4; c >= r; c--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= r; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("  ");
			}
			for (int k = 4; k >= r; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 7.
//		for (int r = 1; r <= 5; r++) {
//			for (int c = 4; c >= r; c--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= r; k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}

		// or

		for (int r = 1; r <= 5; r++) {
			for (int c = 5; c >= 1; c--) {
				if (c > r) {
					System.out.print(" ");
				} else {
					System.out.print(" *");
				}

			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 8.
		for (int r = 1; r <= 5; r++) {
			for (int k = 1; k <= r; k++) {
				System.out.print(" ");
			}
			for (int c = 5; c >= r; c--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 9.
		for (int r = 1; r <= 5; r++) {
			for (int c = 5; c >= r; c--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * r - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 10.
		for (int r = 1; r <= 5; r++) {
			for (int c = 5; c >= r; c--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * r - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int r = 4; r >= 1; r--) {
			for (int c = 5; c >= r; c--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * r - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

	}
}
