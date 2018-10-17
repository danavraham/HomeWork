package string01;

import java.util.Scanner;

public class String01 {

	private static int devideTo(int length) {//find the highst devider
		for (int i = length / 2; i > 0; i--) {
			if (length % i == 0) {

				return i;

			}
		}
		return 1;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a string");
		String str = scan.nextLine();
		int devideTo = devideTo(str.length());
		int length = str.length() / devideTo;

		int x = 0;
		while (x < str.length()) {
			System.out.println(str.substring(x, x + length));
			x += length;
		}

	}
}
