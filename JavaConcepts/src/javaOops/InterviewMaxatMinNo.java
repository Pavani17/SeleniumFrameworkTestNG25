package javaOops;

public class InterviewMaxatMinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 10, 6, 8 }, { 16, 45, 34 }, { 2, 99, 34 } };

		int min = a[0][0];
		int mincolumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}

		}
		System.out.println(min);

		int max = a[0][mincolumn];

		int k = 0;
		while (k < 3) {
			if (a[k][mincolumn] > max) {
				max = a[k][mincolumn];
			}
			k++;
		}

		System.out.println(max);
	}

}
