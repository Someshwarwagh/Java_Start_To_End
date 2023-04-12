package basicInterviewPrograms_Patterns;

// * 1 1 1 *	ABCDE	*****	*****	11111	1*2*3
// 1 * 1 * 1	12345	*1111	*ABCD	11111	1*2*3
// 1 1 * 1 1	ABCDE	*1111	*ABCD	11*11	1*2*3
// 1 * 1 * 1	12345	*1111	*ABCD	11111	1*2*3
// * 1 1 1 *	ABCDE	*1111	*ABCD	11111	1*2*3

public class TypesOfPatterns3 {

	public static void main(String[] args) {

		// 1.
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c < 6; c++) {
				if (r == c || r + c == 6) {
					System.out.print("* ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 2.
		for (int r = 1; r < 6; r++) {
			char ch3 = 'A';
			for (int c = 1; c < 6; c++) {
				if (r % 2 == 1) {
					System.out.print(ch3++);
				} else {
					System.out.print(c);
				}
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 3.
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c < 6; c++) {
				if (r == 1 || c == 1) {
					System.out.print("* ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 4.
		for (int r = 1; r < 6; r++) {
			char ch4 = 'A';
			for (int c = 1; c < 6; c++) {
				if (r == 1 || c == 1) {
					System.out.print("1 ");
				} else {
					System.out.print(ch4++ + " ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 5.
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c < 6; c++) {
				if (r == 3 && c == 3) {
					System.out.print("* ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 6.
		for (int r = 1; r < 6; r++) {
			int n=1;
			for (int c = 1; c < 6; c++) {
				if (c%2==0) {
					System.out.print("* ");
				} else {
					System.out.print(n++ +" ");
				}
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");
	}
}
