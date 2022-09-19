package Exercise4;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1, reverseS1 = "";
		System.out.println("Nhập chuỗi 1");
		s1 = scanner.nextLine();
		for (int i = s1.length() - 1; i >= 0; i--) {
		reverseS1 += s1.charAt(i);
		}
		System.out.println(reverseS1);
		scanner.close();
	}
}
