package entity;

import java.time.LocalDate;

public class GroupAccount {
    public  Group group;
    public  Account account;
    public LocalDate joinDate;

    @Override
    public String toString() {
        return "GroupAccount{" +
                "group=" + group +
                ", account=" + account +
                ", joinDate=" + joinDate +
                '}';
    }
}
