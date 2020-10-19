package oop.oop_enum.other_program2;

public enum Color {

    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;

    public String getCode() {
        return code;
    }

    Color(String code) {
        this.code = code;
    }
}
