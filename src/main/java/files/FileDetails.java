package files;

import java.io.File;

public class FileDetails {
    public static void main(String[] args) {
        File file=new File("filename.txt");
        if(file.exists()){
            System.out.println(file.getName());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.length());
        }
        else {
            System.out.println("File does not exist");
        }
    }
}
