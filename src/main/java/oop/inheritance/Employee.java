package oop.inheritance;

public class Employee extends Person {

    private String company;

//    public Employee(String name) {
//        super(name);
//    }

    public Employee(String name, String company){
        super(name);
        this.company = company;
    }

    public void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }

    @Override
    public void display() {
        System.out.printf("Name: %s \n", getName());
        System.out.printf("Works in %s \n", company);
    }
}
