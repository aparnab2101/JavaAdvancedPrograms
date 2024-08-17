package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamsArray {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("filename1.txt");
            byte[] b=new byte[10];
            file.read(b);
            for (byte by:b){
                System.out.println((char) by);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
