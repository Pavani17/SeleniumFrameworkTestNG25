package coreJavaBasics;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 2, 6, 8, 22, 9, 17, 12 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i] + "is even number");
				break;
			} else {
				System.out.println(numbers[i] + "is odd numner");
			}
		}
	}

}
