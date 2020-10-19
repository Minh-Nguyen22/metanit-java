package input_output.class_byte_array_input_stream;

import java.io.ByteArrayInputStream;

public class Program {

    public static void main(String[] args) {

        byte[] array = new byte[]{2, 4, 6, 1};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);

        int i;
        while ((i = byteArrayInputStream.read()) != -1) {
            System.out.println(i);
        }

        String text = "Hello World";
        byte[] array2 = text.getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(array2);

        int b;
        while ((b = byteArrayInputStream1.read()) != -1) {
            System.out.print(b + " ");
            System.out.print((char)b);
        }
    }
}
