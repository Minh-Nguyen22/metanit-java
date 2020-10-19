package input_output.class_byte_array_output_stream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program2 {

    public static void main(String[] args) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello World Sasha";
        byte[] buffer = text.getBytes();

        try {
            baos.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //try(FileOutputStream fos = new FileOutputStream("C:\\Users\\minhc\\IdeaProjects\\metanit\\src\\main\\java\\input_output\\reading_writing_files\\writing\\SashaHuy")){
            try(FileOutputStream fos = new FileOutputStream("hello.txt")){

            baos.writeTo(fos);
        }
        catch(IOException e){

            System.out.println(e.getMessage());
        }
    }
}
