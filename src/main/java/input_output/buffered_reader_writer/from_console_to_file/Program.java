package input_output.buffered_reader_writer.from_console_to_file;

import java.io.*;

public class Program {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("FromConsoleToFile.txt"))){

            String text;
            while (!(text = br.readLine()).equals("ESC")){
                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
