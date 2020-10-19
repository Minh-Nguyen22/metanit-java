package input_output.close_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("C:\\Users\\minhc\\IdeaProjects\\metanit\\src\\main\\java\\input_output\\reading_writing_files\\writing\\SashaHuy");

            int i = -1;

            while ((i = fin.read()) != -1) {
                System.out.print(i);
            }
        } catch (IOException e){
            e.getMessage();
        } finally {
            try {
                if (fin != null)
                fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
