import java.io.File;
import java.io.IOException;
import java.lang.*;
public class first {
    public static void main(String[] args) throws IOException {
        File f = new File("vasu.txt");
        File[] ff = f.listFiles();
        System.out.println();
        for (File s : ff) {
            System.out.println(s.getName() + " Path of file:  " + s.getAbsolutePath() + "\n");
        }
    }
}