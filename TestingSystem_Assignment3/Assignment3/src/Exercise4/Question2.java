package Exercise4;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------Question 2 ------------");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi 1: ");
		String s1 = sc1.next();
		System.out.println("Nhập vào chuỗi 2: ");
		String s2 = sc1.next();

		System.out.println("Kết quả sau khi nối chuỗi: " + s1 + " " + s2);
		sc1.close();
	}
}
