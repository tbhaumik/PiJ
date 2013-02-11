package worksheet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientDriver {
    public static void main(String[] args) {
        List<Patient> lp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (;;) {
            String name = null;
            try {
                System.out.print("Name: ");
                name = sc.next();

                if (name.equals("end")) break;

                System.out.print("Year of birth: ");
                int age = sc.nextInt();

                lp.add(new Patient(name, age));
            } catch (IllegalArgumentException ex) {
                System.err.println(ex);
                System.err.println("Sorry " + name + " has not been added");
            }
        }

        for (Patient p : lp)
            System.out.println(p);
    }
}
