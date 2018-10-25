package homeStudy;

public class MultiplicationTableVersion2 {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("			     MULTIPLICATION TABLE");
		System.out.println("-------------------------------------------------------------------------------");

		for (int row = 0; row <= 12; row++) {
			
			for (int column = 0; column <= 12; column++) {
				// The first cell on the table is empty
				if (row == 0 && column == 0) {
					System.out.print("|     ");
					continue;
				}
				//If row is zero don't multiply with column, just print the column number, and vice versa
				System.out.printf("| %3d ", (row == 0 || column == 0) ? (row == 0 ? column : row) : row * column);
				if (column == 12) {
					System.out.print("|");
				}
			}
			// Print dashes after the first line
			if (row == 0) {
				System.out.print("\n-------------------------------------------------------------------------------");
			}
			System.out.println();

		}
		System.out.println("-------------------------------------------------------------------------------");

		
		
	}

}
