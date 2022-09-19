package Exercise4;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		char ch1, ch2;
		System.out.println("Nhập chuỗi: ");

		str = scanner.nextLine();
		System.out.println("Nhập kí tự muốn chuyển: ");
		ch1 = scanner.nextLine().toCharArray()[0]; // chuyển một mảng string sang array char, sau đó lấy phần tử thứ 0

		System.out.println("Nhập kí tự sẽ chuyển: ");
		ch2 = scanner.nextLine().toCharArray()[0];
		scanner.close();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch1) {
				str = str.replace(ch1, ch2);
			}
		}
		System.out.println("Chuoi sau khi chuyen: " + str);
	}
}
