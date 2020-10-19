package input_output.print_stream_print_writer.print_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program {

    public static void main(String[] args) {

        String text = "Hello world PrintStream";

        try (FileOutputStream fos = new FileOutputStream("PrintStream.txt");
             PrintStream printStream = new PrintStream(fos)){

            printStream.println(text);
            System.out.println("Zapis v file is done");
        }
        catch (IOException e) {
            e.getMessage();
        }
    }
}
