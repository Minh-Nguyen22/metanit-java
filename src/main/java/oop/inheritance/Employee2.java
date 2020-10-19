package oop.inheritance;

public class Employee2 extends Person2{

    private String company;

    public Employee2(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
