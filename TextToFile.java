package Assignment3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class TextToFile {
    public static void main(String[] args) {
        FileWriter fw= null;
        File file =null;
        try {
            file=new File("WriteFile.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            fw.write("This is an string written to a file");
            fw.flush();
            fw.close();
            System.out.println("File written Succesfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
