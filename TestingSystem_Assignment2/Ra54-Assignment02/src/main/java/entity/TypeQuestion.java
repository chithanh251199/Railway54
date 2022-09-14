package entity;

import java.util.Arrays;

public class TypeQuestion {
    public int typeId;
    public TypeName typeName;
    public Question[] questions;
    public enum TypeName {
        Essay, Multiple_Choice
    }

    @Override
    public String toString() {
        return "TypeQuestion{" +
                "typeId=" + typeId +
                ", typeName=" + typeName +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}
