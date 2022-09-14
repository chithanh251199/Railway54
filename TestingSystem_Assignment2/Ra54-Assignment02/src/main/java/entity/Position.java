package entity;

import java.util.Arrays;

public class Position {
    public int positionId;
    public PositionName positionName;
    public Account[] accounts;
    public enum PositionName {
        Dev, Test, Scrum_Master, PM;
    }


//    public void hienTHi(){
//        System.out.println(" Id chuc vu la: " + positionId + ", ten chuc vu la: " + positionName);
//    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", positionName=" + positionName +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
