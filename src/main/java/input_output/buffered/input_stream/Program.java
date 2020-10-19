package input_output.buffered.input_stream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String text = "Hello World OOO";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);

        try (BufferedInputStream bis = new BufferedInputStream(in)){

            int a;

            while ((a = bis.read())!=-1){
                System.out.print((char)a);
            }
        }
        catch (IOException exception){
            exception.getMessage();
        }
        System.out.println();
    }
}
