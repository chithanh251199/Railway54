package Exercise4;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("Nhập chuỗi: ");
		str = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < str.length(); i++) {
		if (checkKeyNumber(str.charAt(i))) {
		System.out.println("False");
		return;
		}
		}
		System.out.println("True");
		}
		public static boolean checkKeyNumber(char ch) {
		if (ch >= '0' && ch <= '9') {
		return true;
		}
		return false;
	}
}
