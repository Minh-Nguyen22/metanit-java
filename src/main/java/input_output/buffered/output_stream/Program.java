package input_output.buffered.output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String text = "Hello World from BufferedOutputStream!";
        try (FileOutputStream out = new FileOutputStream("BufferedOutputStream.txt");
            BufferedOutputStream bos = new BufferedOutputStream(out)){

            byte[] buffer = text.getBytes();
            bos.write(buffer);
            out.write(buffer,1, buffer.length - 1);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
