package Exercise1;

public class Question2 {
	public static void main(String[] args) {
		int min = 0;
		int max = 99999;
		int a = (int) (Math.random() * max) + min;
		while (a < 10000) {
			a = a * 10;
		}
		System.out.println("Số ngẫu nhiên: " + a);
	}
}
