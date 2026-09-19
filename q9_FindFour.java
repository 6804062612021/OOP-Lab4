package homework4;

import java.util.Scanner;

class FindFour {
	static boolean isConsecutiveFour(int[][] values) {
		int row = values.length;
		int col = values[0].length;
		if (row < 4 && col < 4) return false;
		
		for (int i=0; i<row; i++) {
			for  (int j=0; j<col; j++) {
				int current = values[i][j];

				//Right
				if (j + 3 < col) {
					if (current == values[i][j + 1] && 
						current == values[i][j + 2] && 
						current == values[i][j + 3]) {
						return true;
					}
				}

				//Down
				if (i + 3 < row) {
					if (current == values[i + 1][j] && 
						current == values[i + 2][j] && 
						current == values[i + 3][j]) {
						return true;
					}
				}

				//Down-Right
				if (i + 3 < row && j + 3 < col) {
					if (current == values[i + 1][j + 1] && 
						current == values[i + 2][j + 2] && 
						current == values[i + 3][j + 3]) {
						return true;
					}
				}

				//Down-Left
				if (i + 3 < row && j - 3 >= 0) {
					if (current == values[i + 1][j - 1] && 
						current == values[i + 2][j - 2] && 
						current == values[i + 3][j - 3]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}

public class q9_FindFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
        int[][] values = new int[n][m];
		
		for (int i=0; i<n; i++) {
			for  (int j=0; j<m; j++) {
				values[i][j] = input.nextInt();
			}
		}
		
		System.out.println(FindFour.isConsecutiveFour(values));
	}
}
