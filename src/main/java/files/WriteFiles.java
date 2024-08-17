package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("filename1.txt");
            fileWriter.write("Hello Aparna ,Welcome to File Handling");
            fileWriter.write(Integer.toString(23));
            fileWriter.close();
            System.out.println("Successfully written data to a file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
