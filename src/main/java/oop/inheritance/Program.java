package oop.inheritance;

public class Program {

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.display();
        Employee sam = new Employee("we", "Apple");
        sam.display();
        sam.work();
    }
}
