package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputReadAll {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("filename1.txt");
            int data;
            while ((data=file.read())!=-1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
