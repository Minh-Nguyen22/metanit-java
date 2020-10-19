package input_output.reading_writing_files.reading_and_writing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        try (FileInputStream fin = new FileInputStream("C:\\Users\\minhc\\IdeaProjects\\metanit\\src\\main\\java\\input_output\\reading_writing_files\\writing\\SashaHuy");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\minhc\\IdeaProjects\\metanit\\src\\main\\java\\input_output\\reading_writing_files\\writing\\SashaHuyNew")) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer);
            fos.write(buffer);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
