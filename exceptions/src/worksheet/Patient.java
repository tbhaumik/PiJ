package worksheet;

import java.util.Calendar;

public class Patient {
    private String name;
    private int year;

    public Patient(String name, int year) {
        final int LIMIT = 130;
        Calendar c = Calendar.getInstance();
        int yr = c.get(Calendar.YEAR) - year;

        if ((yr < 0) || (yr > LIMIT)) {
            throw new IllegalArgumentException("Dodgy age [" + yr + "]");
        }

        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Year: " + year;
    }
}
