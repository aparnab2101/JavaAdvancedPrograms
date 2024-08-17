package files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("filename.txt");
        if(file.delete()){
            System.out.println("Deleted Successfully"+file.getName());
        }
        else {
            System.out.println("File not found");
        }
    }
}
