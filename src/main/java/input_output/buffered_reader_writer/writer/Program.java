package input_output.buffered_reader_writer.writer;

import java.io.*;

public class Program {

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("BufferedWriter.txt"))){

            String text = "Hello World! \nHey! Yo!";
            bw.write(text);


        }
        catch (IOException e){
            e.getMessage();
        }
        try (BufferedReader br = new BufferedReader(new FileReader("BufferedWriter.txt"))){
            int c;
            while((c=br.read()) != -1){

                System.out.print((char)c);
            }
        }
        catch (IOException e ){
            e.getMessage();
        }

    }
}
