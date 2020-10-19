package oop.inheritance;

public class Person2 {

    private String name;

    public String getName() {
        return name;
    }

    public Person2(String name) {
        this.name = name;
    }

    public void display() {
        System.out.printf("Person %s \n", name);
    }
}
