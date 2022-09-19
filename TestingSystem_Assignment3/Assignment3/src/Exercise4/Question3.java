package Exercise4;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Nhập Tên: ");
		name = scanner.nextLine();
		String firstCharacter = name.substring(0, 1).toUpperCase();
		String leftCharacter = name.substring(1);
		System.out.println("char at:" + name.charAt(0));
		name = firstCharacter + leftCharacter;
		System.out.println(name);
		scanner.close();
	}
}
