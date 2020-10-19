package oop.copiyng_objects;

public class Program {

    public static void main(String[] args) {

        try {
            Person tom = new Person("Tom", 23);
            tom.display();
            Person bob = tom.clone();
            bob.setName("Bob");
            tom.display();
            bob.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
