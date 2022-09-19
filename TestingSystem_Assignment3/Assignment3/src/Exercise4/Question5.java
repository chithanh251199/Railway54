package Exercise4;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ: ");
		String firstName = scanner.nextLine();
		System.out.println("Nhập tên: ");
		String lastName = scanner.nextLine();
		System.out.println("Họ tên đầy đủ: " + firstName.concat(lastName));
		scanner.close();
	}
}
