package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    public int accountId;
    public String email;
    public String username;
    public String fullName;
    public Department department;
    public Position position;
    public LocalDate createDate;
    public Group[] groups;

//    public void hienThi(){
//        System.out.println(" Ten: " +fullName + ", ngay tao: " +createDate );
//    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
