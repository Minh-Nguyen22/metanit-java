package input_output.print_stream_print_writer.print_stream;

import java.io.IOException;
import java.io.PrintStream;

public class Program2 {

    public static void main(String[] args) {

        try (PrintStream printStream = new PrintStream("PrintStream2.txt")){
            printStream.print("Hello World!");
            printStream.println("Welcome to java!");
            printStream.printf("Name: %s Age: %d \n", "Tom", 34);

            String message = "printStream";
            byte[] messageToByte = message.getBytes();

            printStream.write(messageToByte);
            System.out.println("The file has been written");
        }
        catch (IOException e) {
            e.getMessage();
        }
    }
}
