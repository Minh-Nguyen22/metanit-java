package input_output.reading_writing_files.writing;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String text = "Hello world!";
        try(FileOutputStream fos=new FileOutputStream("C:\\Users\\minhc\\IdeaProjects\\metanit\\src\\main\\java\\input_output\\reading_writing_files\\reading\\SashaHuy"))
        {
            byte[] buff = text.getBytes();
            fos.write(buff, 0, buff.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}
