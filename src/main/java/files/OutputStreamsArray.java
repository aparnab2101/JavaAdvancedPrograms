package files;

import java.io.FileOutputStream;

public class OutputStreamsArray {
    public static void main(String[] args) {
        try{
            FileOutputStream file=new FileOutputStream("filename.txt");
            byte[] b={100,101,102,103,104,105,106,107};
            file.write(b);
            file.close();
            System.out.println("Wrote Successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
