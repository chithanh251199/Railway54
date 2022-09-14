package entity;

import java.util.Arrays;

public class Department {
    public int departmentId;
    public  String departmentName;
    public Account[] accounts;

//    public void hienThi(){
//        System.out.println(" Id phong ban la: " + departmentId +", ten phong ban la: " +departmentName);
//    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
