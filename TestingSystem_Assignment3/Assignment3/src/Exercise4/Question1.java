package Exercise4;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		String s1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		s1 = scanner.nextLine();
		String[] words = s1.split(" ");
		System.out.println("Số kí tự: " + words.length);
		scanner.close();
	}
}
