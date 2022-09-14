package entity;

import java.util.Arrays;

public class CategoryQuestion {
    public int categoryId;
    public int categoryName;
    public Question[] questions;

    @Override
    public String toString() {
        return "CategoryQuestion{" +
                "categoryId=" + categoryId +
                ", categoryName=" + categoryName +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}
