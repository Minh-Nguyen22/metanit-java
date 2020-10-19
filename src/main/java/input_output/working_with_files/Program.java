package input_output.working_with_files;

import java.io.File;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        File myFile = new File("WorkingWithFiles.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());

        if (myFile.exists()) {
            System.out.println("File exists");
        }
        else
            System.out.println("File not found");

        System.out.println("File size: " + myFile.length());

        if (myFile.canRead()){
            System.out.println("File can be read");
        }
        else{
            System.out.println("File can not be read");
        }

        if (myFile.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");

        File newFile = new File("WorkingWithFiles2.txt");

        try {
            boolean created = newFile.createNewFile();
            if (created)
                System.out.println("File has been created");
        }
        catch (IOException e) {
            e.getMessage();
        }
    }
}
