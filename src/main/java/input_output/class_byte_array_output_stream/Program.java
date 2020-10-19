package input_output.class_byte_array_output_stream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello World";
        byte[] buffer = text.getBytes();
        try {
            baos.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(baos.toString());

        byte[] array = baos.toByteArray();

        for (byte b : array) {
            System.out.print((char)b);
        }
        System.out.println();
    }
}
