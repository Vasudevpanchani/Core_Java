import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class readandwrite{
    void readFile() throws FileNotFoundException {
        FileInputStream fi=new FileInputStream("vasu.txt");
    }
    void saveFile() throws FileNotFoundException{
        String text="vasudev panchani";
        FileOutputStream fo=new FileOutputStream("vasu2.txt");
    }
}
public class ThrowsKeyword {
    public static void main(String[] args) {
        readandwrite r=new readandwrite();
        try {
            r.readFile();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("ended..");
        try {
            r.saveFile();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("ended..");
    }
}
