package impl;

import interfaces.Contact;
import interfaces.Meeting;
import java.util.HashSet;

import java.util.Calendar;

public class DriverExampleForAMethodCallNotPartOfTheInterface {
    public static void main(String[] args) {
        Meeting m = new FutureMeetingImpl(Calendar.getInstance(), new HashSet<Contact>());
        ((MeetingImpl)m).meth();
    }
}
