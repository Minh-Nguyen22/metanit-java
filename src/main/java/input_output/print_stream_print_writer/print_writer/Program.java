package input_output.print_stream_print_writer.print_writer;

import java.io.PrintWriter;

public class Program {

    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter(System.out )){
            pw.println("Hello world");
        }
    }
}
