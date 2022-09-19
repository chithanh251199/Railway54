package Exercise4;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("Mời bạn nhập vào một chuỗi: ");
		str = scanner.nextLine();
		scanner.close();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ('a' == str.charAt(i)) {
				count++;
			}
		}

		System.out.println(count);
	}
}
