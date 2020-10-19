package oop.object_methods;

public class Program {

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        Person bob = new Person("Bob");
        Person tom2 = new Person("Tom");

        System.out.println(tom.toString());

        System.out.println(tom.equals(bob));
        System.out.println(tom.equals(tom2));

        System.out.println(bob.hashCode());
    }
}
