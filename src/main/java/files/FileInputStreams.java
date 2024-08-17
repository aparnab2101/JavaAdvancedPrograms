package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreams {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("filename1.txt");
            int data=file.read();
            System.out.println((char)data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
