package oop.oop_enum.other_program;

import oop.oop_enum.Type;

public class Program {
    public static void main(String[] args) {

        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }

        System.out.println(Type.BELLETRE.ordinal());
        System.out.println(types[3]);
    }
}
