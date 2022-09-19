package Exercise4;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fullName;
		System.out.println("Nhập họ tên đầy đủ");
		fullName = scanner.nextLine();
		scanner.close();
		// remove space characters
		fullName = fullName.trim();
		fullName = fullName.replaceAll("\\s+", " ");
		System.out.println("test: " + fullName);
		String[] words = fullName.split(" ");
		fullName = "";
		for (String word : words) {
			String firstCharacter = word.substring(0, 1).toUpperCase();
			String leftCharacter = word.substring(1);
			word = firstCharacter + leftCharacter;
			fullName += word + " ";
		}
		System.out.println("Họ tên sau khi chuẩn hóa: " + fullName);
	}
}
