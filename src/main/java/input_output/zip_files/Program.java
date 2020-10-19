package input_output.zip_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Program {

    public static void main(String[] args) {

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("ZipFile.zip"));
             FileInputStream fis = new FileInputStream("FileToZip.txt")){

            ZipEntry entry = new ZipEntry("FileToZip.txt");
            zout.putNextEntry(entry);

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            zout.write(buffer);

            zout.closeEntry();
        } catch (Exception e) {
            e.getMessage();
        }

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("ZipFile.zip"))){

            ZipEntry entry1;
            String name;
            long size;
            while ((entry1 = zis.getNextEntry()) != null){
                name = entry1.getName();
                size = entry1.getSize();
                System.out.printf("File name: %s \t File size: %d \n", name, size);

                FileOutputStream fout = new FileOutputStream("new" + name);
                for (int i = zis.read(); i != -1; i = zis.read()) {
                    fout.write(i);
                }
                fout.flush();
                zis.closeEntry();
                fout.close();
            }
        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}
