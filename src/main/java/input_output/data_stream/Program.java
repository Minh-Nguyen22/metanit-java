package input_output.data_stream;

import java.io.*;

public class Program {

    public static void main(String[] args) {

        Person tom = new Person("Tom", 34, 1.68, false);
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataStream.txt")))
        {
            // записываем значения
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        // обратное считывание из файла
        try(DataInputStream dos = new DataInputStream(new FileInputStream("dataStream.txt")))
        {
            // записываем значения
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}

