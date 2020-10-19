package input_output.buffered_reader_writer.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader (new FileReader("BufferedWriter.txt")))
        {
            // чтение посимвольно
//            int c;
//            while((c=br.read())!=-1){
//
//                System.out.print((char)c);
//            }

            String s;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
