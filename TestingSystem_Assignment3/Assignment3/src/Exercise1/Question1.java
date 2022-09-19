package Exercise1;

public class Question1 {
	public static void main(String[] args) {
		// Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
		float Salary1;
		float Salary2;
		Salary1 = (float) 5240.5;
		Salary2 = (float) 10970.055;
		System.out.println("Salary1: " + Salary1 + "|| Salary2: " + Salary2);
		int roundSalary1 = (int) Salary1;
		int roundSalary2 = (int) Salary2;
		System.out.println("roundSalary1: " + roundSalary1 + " || roundSalary2: " + roundSalary2);
	}
}
