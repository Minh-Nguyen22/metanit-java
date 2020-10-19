package oop.objects;

public class Program {

    public static void main(String[] args) {

        Person kate = new Person("Kate");
        System.out.println(kate.getName());     // Kate
        Person v = new Person("Vy");
        changePerson(kate);
        System.out.println(kate.getName());     // Kate - изменения не произошло
        // kate хранит ссылку на старый объект
    }
    static void changePerson(Person p){
        p = new Person("Alice");    // p указывает на новый объект
        p.setName("Ann");
    }
    static void changeName(Person p){
        p.setName("Alice");
    }
}
