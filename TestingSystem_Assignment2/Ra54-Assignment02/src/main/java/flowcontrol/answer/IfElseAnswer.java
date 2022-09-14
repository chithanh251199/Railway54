package flowcontrol.answer;

import entity.Account;
import entity.Department;
import entity.Position;

public class IfElseAnswer {
    public static void main(String[] args) {
        //question1
        Account account1 = new Account();
        Department department1 = new Department();
        Position position = new Position();
        position.positionName = position.positionName.Dev;
        department1.departmentId = 1;
        department1.departmentName = "Sale";
        account1.department = department1;
        account1.position = position;
        System.out.println("------------------question1-----------------------");

        if(account1.department == null){
            System.out.println("Nhan vien nay chua co phong ban");
        }else {
            System.out.println("phong ban cua nhan vien nay la: " + account1.department);
        }

        //questrion2
        System.out.println("------------------question2-----------------------");

        if(account1.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        }else{
            int countGroup = account1.groups.length;
            if (countGroup == 1 || countGroup == 2 ){
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }if (countGroup == 3){
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            }if (countGroup >= 4 ){
                System.out.println("Nhân viên này là người hóng  chuyện, tham gia tất cả các group");
            }
        }

        //question3
        System.out.println("------------------question3-----------------------");

        String q3 = (account1.department == null) ? "Nhan vien nay chua co phong ban" : "phong ban cua nhan vien nay la: " + account1.department;
        System.out.println(q3);

        //question4
        System.out.println("------------------question4-----------------------");

        String q4 = (account1.position.positionName.toString() == "Dev") ? "Đây là Developer" : "Người này không phải là Developer" + account1.position;
        System.out.println(q4);
    }
}
