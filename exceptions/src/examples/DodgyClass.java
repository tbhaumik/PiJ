package examples;

import java.util.ArrayList;
import java.util.List;

public class DodgyClass {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        try {
            for (;;)
                l.add(new Object());
        }
        catch (Exception ex) {
            System.err.println("Ouch!");
        }
        finally {
            System.err.println("Finally");
        }
    }
}
