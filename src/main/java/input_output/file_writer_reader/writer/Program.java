package input_output.file_writer_reader.writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("fileWriterReader.txt", false);
             FileReader reader = new FileReader("fileWriterReader.txt")) {
            String text = "Hello World FileWriterReader";
            writer.write(text);
            writer.append("\n");
            writer.append('E');

            writer.flush();

            int c;

            while ((c = reader.read()) != -1){
                System.out.print((char) c);
            }
        }
        catch (IOException e ) {
            e.getMessage();
        }
    }
}
