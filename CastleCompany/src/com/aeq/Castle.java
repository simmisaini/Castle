package com.aeq;



import java.util.Scanner;

public class Castle {

	public static void main(String args[]) {
		Castle cas = new Castle();
		int[] landScape = {};
		try {
			landScape = cas.readLandScapeData();
			System.out.println("Number of Castles: "
					+ cas.getCastleCount(landScape));
		} catch (Exception e) {
			System.out.println("Invalid Input!! Please try again with integer value:");

		}
	}

	public int[] readLandScapeData() {
		int[] landScapeArr = {};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of entries in the landscape: ");
		int size = s.nextInt();
		landScapeArr = new int[size];
		System.out.println("Enter the individual height: ");
		for (int i = 0; i < size; i++) {
			landScapeArr[i] = (s.nextInt());
		}
		return landScapeArr;
	}

	public int getCastleCount(int[] in) {
		int castles = 0;
		int length = in.length;
		// if landscape has no entries
		if (length == 0) {
			return castles;
		}
		// if landscape has only one entry , then one castle can be build
		if (length == 1) {
			return castles + 1;
		}
		for (int i = 0; i < length - 1; i++) {
			if ((i == 0) || ((in[i - 1] < in[i]) && (in[i] >= in[i + 1]))
					|| ((in[i - 1] > in[i]) && (in[i] <= in[i + 1]))) {
				castles = castles + 1;
			}
		}
		// since loop runs till last but one entry. Add one, in case of peak or
		// valley from last but one item.
		if (in[length - 2] != in[length - 1])
			castles = castles + 1;
		return castles;
	}

}
