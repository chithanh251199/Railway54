package Exercise4;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = scanner.nextLine();
		name = name.toUpperCase();
		for (int i = 0; i < name.length(); i++) {
			System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i));
		}
		scanner.close();
	}
}
