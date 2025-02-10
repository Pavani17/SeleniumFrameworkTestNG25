package coreJava;

public class EnhancedforLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = { "pavani", "kakileti", "Automation testing" };

		for (String s : name) {
			System.out.println(s);
		}

		int[] arr = { 17, 06, 1994, 2007, 2010, 2012, 2016, 10, 3, 7, 5 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				break;
			}

			else {
				System.out.println(arr[i] + " is an odd number");
			}
		}
	}

}
