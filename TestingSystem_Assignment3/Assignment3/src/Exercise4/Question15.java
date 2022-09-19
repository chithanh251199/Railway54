package Exercise4;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		System.out.println("Chuỗi: ");
		str = scanner.nextLine();
		scanner.close();
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		String[] words = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}
