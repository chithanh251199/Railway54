package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    public  int groupId;
    public String groupName;
    public Account creator;
    public LocalDate createDate;
    public Account[] accounts;

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
