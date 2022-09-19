package Exercise2;

import java.time.LocalDate;

public class Question1 {
	public static void main(String[] args) {
		System.out.println("Khởi tạo mảng Account gồm 5 phần tử sử dụng For");

		Account[] accArray = new Account[5];
		for (int i = 0; i < accArray.length; i++) {
			Account acc = new Account();
			acc.email = "Email " + i;
			acc.userName = "User name " + i;
			acc.fullName = "Full name " + i;
			acc.createDate = LocalDate.now();
			accArray[i] = acc;
			System.out.println(
					"Thông tin Account " + i + " Email: " + accArray[i].email + " UserName: " + accArray[i].userName
							+ " FullName: " + accArray[i].fullName + " CreateDate: " + accArray[i].createDate);

		}
	}
}
