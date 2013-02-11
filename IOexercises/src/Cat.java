import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {
        if (args.length != 0) {
            String fileName = args[0];
            if (fileName != null) {
                File f = new File(fileName);
                if (f.exists()) {
                    echoFile(f);
                } else {
                    System.err.println("File name: " + fileName + " does not exist");
                }
            }
        } else System.out.println("No files to process");
    }

    private static void echoFile(File f) {
        try (Scanner sc = new Scanner(f);) {
            while (sc.hasNext())
                System.out.println(sc.next());
        } catch (FileNotFoundException ex) {

        }
    }
}
