package Exercise1;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a = ");
		a = scanner.nextInt();
		do {
			System.out.println("Nhập b = ");

			b = scanner.nextInt();
			if (b == 0) {
				System.out.println("Vui lòng nhập b khác 0 !");
			}
		} while (b == 0);
		scanner.close();
		System.out.println("Thương: " + (float) a / (float) b);
	}
}
