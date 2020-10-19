package oop.inner_and_nested_classes;

public class Program {

    public static void main(String[] args) {
        Person tom = new Person("Tom", "qwerty");
        tom.displayPerson();
        tom.account.displayAccount();

    }
}
