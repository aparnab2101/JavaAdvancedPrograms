package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadToAnother {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("filename1.txt");
            FileOutputStream fout=new FileOutputStream("filename.txt");
            int data;
            while ((data=fin.read())!=-1){
                fout.write(data);
            }
            fin.close();
            fout.close();
            System.out.println("Wrote");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
