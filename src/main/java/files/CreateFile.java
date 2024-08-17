package files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("filename1.txt");
            if(file.createNewFile()){
                System.out.println("Successfully created"+file.getAbsolutePath());
            }else {
                System.out.println("Already exist");
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
