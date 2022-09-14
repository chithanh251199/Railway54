package flowcontrol.answer;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;

import java.time.LocalDate;

public class ProgramData {
    public static void main(String[] args) {
        //Department
        System.out.println("---------------------------Department-------------------------");

        Department department = new Department();
        department.departmentId = 1;
        department.departmentName = "Sale";
        System.out.println(department);

        Department department1 = new Department();
        department1.departmentId = 2;
        department1.departmentName = "Marketing";
        System.out.println(department1);

        Department department2 = new Department();
        department2.departmentId = 3;
        department2.departmentName = "DEV";
        System.out.println(department2);

        //Position
        System.out.println("-----------------------------Position----------------------");

        Position position = new Position();
        position.positionId = 1;
        position.positionName = position.positionName.Dev;
        System.out.println(position);

        Position position1 = new Position();
        position1.positionId = 2;
        position1.positionName = position.positionName.Test;
        System.out.println(position1);

        Position position2 = new Position();
        position2.positionId = 3;
        position2.positionName = position.positionName.Scrum_Master;
        System.out.println(position2);

        //Account
        System.out.println("-----------------------------Account----------------------");

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

        //Group
        System.out.println("-----------------------------Group----------------------");

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

        group.accounts = new Account[] {account};
        group2.accounts = new Account[] {account1,account2};
        group2.accounts = new Account[] {account2};
    }
}
