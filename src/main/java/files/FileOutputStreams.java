package files;

import java.io.FileOutputStream;

public class FileOutputStreams {
    public static void main(String[] args) {
        try{
            FileOutputStream file=new FileOutputStream("filename.txt");
            file.write(1000);
            file.close();
            System.out.println("Write successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
