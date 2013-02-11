package impl;

import interfaces.Contact;
import interfaces.ContactManager;
import interfaces.FutureMeeting;
import interfaces.Meeting;
import interfaces.PastMeeting;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ContactManagerImpl implements ContactManager {
    private static final String FILENAME = "contacts.txt";

    private Set<Contact> contacts;
    private List<Meeting> meetings;


    public ContactManagerImpl() {
        // file does not exist or is directory or isn't readable
        if (!new File(FILENAME).exists()) {
             // initialize structures
            contacts = new TreeSet<>();
            meetings = new ArrayList<>();
        } else
            try (ObjectInputStream
                         d = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(FILENAME)));) {
                contacts = (Set<Contact>) d.readObject();
                meetings = (List<Meeting>) d.readObject();

            } catch (IOException | ClassNotFoundException ex) {
                System.err.println("On read error " + ex);
            }
    }

    @Override
    public int addFutureMeeting(Set<Contact> contacts, Calendar date) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PastMeeting getPastMeeting(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public FutureMeeting getFutureMeeting(int id) {


        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Meeting getMeeting(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Meeting> getFutureMeetingList(Contact contact) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Meeting> getFutureMeetingList(Calendar date) {
        List<Meeting> fm = (List) new ArrayList<FutureMeetingImpl>();
        return fm;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<PastMeeting> getPastMeetingList(Contact contact) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addNewPastMeeting(Set<Contact> contacts, Calendar date, String text) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addMeetingNotes(int id, String text) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addNewContact(String name, String notes) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<Contact> getContacts(int... ids) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<Contact> getContacts(String name) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void flush() {
        try (ObjectOutputStream
                     encode = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(FILENAME)));) {

            encode.writeObject(contacts);
            encode.writeObject(meetings);
        } catch (IOException ex) {
            System.err.println("write error: " + ex);
        }

    }
}
