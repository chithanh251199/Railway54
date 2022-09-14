package flowcontrol.answer;

import entity.Account;
import entity.Group;
import entity.Department;
import entity.Position;

import java.time.LocalDate;

public class SwitchCaseAnswer {
    public static void main(String[] args) {

        Account account = new Account();
        account.accountId = 1;
        account.email = "nguyenvanA@gmail.com";
        account.username = "nguyenvana";
        account.fullName = "Nguyễn Văn A";
        account.department = department;
        account.position = position;
        account.createDate = LocalDate.now();
        System.out.println(account);

        Account account1 = new Account();
        account1.accountId = 2;
        account1.email = "nguyenvanB@gmail.com";
        account1.username = "nguyenvanb";
        account1.fullName = "Nguyễn Văn B";
        account1.department = department1;
        account1.position = position1;
        account1.createDate = LocalDate.now();
        System.out.println(account1);

        Account account2 = new Account();
        account2.accountId = 3;
        account2.email = "nguyenvanC@gmail.com";
        account2.username = "nguyenvanc";
        account2.fullName = "Nguyễn Văn C";
        account2.department = department2;
        account2.position = position2;
        account2.createDate = LocalDate.now();
        System.out.println(account2);

        Group group = new Group();
        group.groupId = 1;
        group.groupName = "Group";
        group.createDate = LocalDate.of(2019,10,25);
        group.creator = account;
        group.accounts = new Account[]{account, account1};
        System.out.println(group);

        Group group1 = new Group();
        group1.groupId = 2;
        group1.groupName = "Group1";
        group1.createDate = LocalDate.now();
        group1.creator = account1;
        group.accounts = new  Account[]{account1, account2};
        System.out.println(group1);

        Group group2 = new Group();
        group2.groupId = 3;
        group2.groupName = "Group2";
        group2.createDate = LocalDate.of(2020, 8, 20);
        group2.creator = account;
        group.accounts = new Account[]{account,account1};
        System.out.println(group2);
        group1.accounts = new Account[] { acc1 };
        group2.accounts = new Account[] { acc1, acc2 };
        group3.accounts = new Account[] { acc2 };
    }
}
