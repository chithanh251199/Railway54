package Exercise4;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		String fullName;
		String lastName = "", middleName = "", firstName = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên đầy đủ:");
		fullName = scanner.nextLine();
		// Chuẩn hóa xâu
		fullName = fullName.trim();
		String[] words = fullName.split(" ");
		lastName = words[0];
		firstName = words[words.length - 1];
		for (int i = 1; i <= words.length - 2; i++) {
		middleName += words[i] + " ";
		}
		System.out.println("Họ là: " + lastName);
		System.out.println("Tên đệm là: " + middleName);
		System.out.println("Tên là: " + firstName);
		scanner.close();
	}
}
