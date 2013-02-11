/*
 * How might you refactor this code to improve it?
 * See also nio Files and Path
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Cp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cp file1 file 2");
        String file1 = getFileName(sc, "Filename 1: ");
        File in = new File(file1);
        if (!in.exists()) {
            System.err.println("Filename [" + file1 + "] does not exist");
            return;
        } else if (in.isFile()) {
            String file2 = getFileName(sc, "Filename 2: ");
            File out = new File(file2);
            if (out.exists()) {
                System.out.print("File [" + file2 + "] already exists - overwrite? (y/n)");
                while (!sc.hasNext("[yn]")) {
                    System.out.println("That's not y or n !");
                    sc.next();
                }
                if (sc.next() == "y") {
                    copyFile(file1, file2);
                }
            } else
                copyFile(file1, file2);
        } else
            System.err.println(file1 + " is not a file!");
    }

    private static String getFileName(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }


    private static void copyFile(String src, String dest) {
        try (FileInputStream in = new FileInputStream(src);
             FileOutputStream out = new FileOutputStream(dest);) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (Exception ex) {
            System.err.println("oops: " + ex);
        }
    }
}
