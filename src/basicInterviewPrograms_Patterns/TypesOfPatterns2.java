package basicInterviewPrograms_Patterns;

public class TypesOfPatterns2 {

//	12345	01010	1*1*1	AAAAA	ABCDE	12222	*1*2*
//	67891	10101	*1*1*	BBBBB	ABCDE	21222	3*4*5
//	23456	01010	1*1*1	CCCCC	ABCDE	22122	*6*7*
//	78912	10101	*1*1*	DDDDD	ABCDE	22212	8*9*1
//	34567	01010	1*1*1	EEEEE	ABCDE	22221	*2*3*

	public static void main(String[] args) {

		// 1.
		int num = 1;
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c < 6; c++) {
				if (num == 10) {
					num = 1;
				}
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 2.
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(c % 2 == 0 ? "0 " : "1 ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		int num1 = 1;
		// 3.
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c < 6; c++) {
				System.out.print(num1 % 2 == 0 ? "1 " : "* ");
				num1++;
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 4
		char ch = 'A';
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c < 6; c++) {
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 5
		for (int r = 1; r < 6; r++) {
			char ch1 = 'A';
			for (int c = 1; c < 6; c++) {
				System.out.print(ch1 + " ");
				ch1++;
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------");

		// 6
		for (int r = 1; r < 6; r++) {
			char ch1 = 'A';
			for (int c = 1; c < 6; c++) {
				System.out.print(c==r?"1 ":"2 ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		// 7
		int num3=1;
		int num4=1;
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c < 6; c++) {
				if(num4==10)
				{
					num4=1;
				}
				System.out.print(num3%2==0?(num4++)+" ":"* ");
				num3++;
			}
			System.out.println();
		}
	}
}
