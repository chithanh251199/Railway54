package Exercise4;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1, s2, reverseS1 = "";
		System.out.println("Nhập chuỗi 1");
		s1 = scanner.nextLine();
		System.out.println("Nhập chuỗi 2");
		s2 = scanner.nextLine();
		scanner.close();
		for (int i = s1.length() - 1; i >= 0; i--) {
			reverseS1 += s1.substring(i, i + 1);
		}
		if (s2.equals(reverseS1)) {
			System.out.println("Đây là chuỗi đảo ngược !");
		} else {
			System.out.println("Đây không phải chuỗi đảo ngược");
		}
	}
}
