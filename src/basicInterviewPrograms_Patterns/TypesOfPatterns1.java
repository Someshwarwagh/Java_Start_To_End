package basicInterviewPrograms_Patterns;

public class TypesOfPatterns1 {

//	*****	11111	12345	10101	
//	*****	11111	12345	10101
//	*****	11111	12345	10101	
//	*****	11111	12345	10101	
//	*****	11111	12345	10101

	public static void main(String[] args) {

		// 1.
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");
		
		// 2.
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				System.out.print("1 ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");
		
		// 3.
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c < 6; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");
		
		// 4
		for (int r = 1; r < 6; r++) {
			for (int c = 1; c < 6; c++) {
				System.out.print(c%2==0?"0"+ " ":"1" + " ");
			}
			System.out.println();
		}
	}
}
