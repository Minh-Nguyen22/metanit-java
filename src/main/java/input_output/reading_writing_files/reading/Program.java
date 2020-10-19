package input_output.reading_writing_files.reading;

import java.io.FileInputStream;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("C:\\Users\\minhc\\IdeaProjects\\metanit\\src\\main\\java\\input_output\\reading_writing_files\\writing\\SashaHuy")){

            System.out.printf("File size: %d bytes \n", fin.available());

            int i = -1;
            while ((i= fin.read()) != -1){
                System.out.print((char)i);
            }

            System.out.println("---------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fin = new FileInputStream("C:\\Users\\minhc\\IdeaProjects\\metanit\\src\\main\\java\\input_output\\reading_writing_files\\writing\\SashaHuy")) {
            byte[] buffer1 = new byte[fin.available()];
            fin.read(buffer1);
            System.out.println("File data: ");
            for (int j = 0; j < buffer1.length; j++) {
                System.out.print((char)buffer1[j]);

            }
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
