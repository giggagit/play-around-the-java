package com.giggagit.number;

/**
 * Pyramid
 */
public class Pyramid {

	private int rowCount = 1;

	public void pattenOne(int row) {
		for (int i = row; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= rowCount; j++) {
				System.out.print("* ");
			}

			System.out.print("\n");
			rowCount++;
		}
	}

	public void pattenTwo(int row) {
		for (int i = row; i > 0; i--) {

			for (int j = 1; j < rowCount; j++) {
				System.out.print(" ");
			}

			for (int j = row; j >= rowCount; j--) {
				System.out.print("* ");
			}

			System.out.print("\n");
			rowCount++;
		}
	}

}