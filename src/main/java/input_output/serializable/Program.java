package input_output.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {


        String fileName = "Serializable.txt";

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Tom", 30, 175, false));
        people.add(new Person("Sam", 33, 178, true));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(people);
            System.out.println("File has been written");
        } catch (Exception ex) {
            ex.getMessage();
        }

        ArrayList<Person> newPeople = new ArrayList<Person>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            newPeople = ((ArrayList<Person>) ois.readObject());
        } catch (Exception ex) {
            ex.getMessage();
        }

        for (Person p :
                newPeople) {
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        }
    }
}