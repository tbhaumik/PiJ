package impl;

import interfaces.Contact;
import interfaces.Meeting;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

public  abstract class MeetingImpl implements Meeting, Serializable {
    private static int globalId;
    private int id;
    private Calendar date;
    private Set<Contact> contacts;

    static{
        globalId = 0;
    }

    public MeetingImpl(Calendar date, Set<Contact> contacts){
        this(++globalId, date, contacts);
    }

    protected MeetingImpl(int id, Calendar date, Set<Contact> contacts){
        this.id = id;
        this.date = date;
        this.contacts = contacts;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Calendar getDate() {
        return date;
    }

    @Override
    public Set<Contact> getContacts() {
        return contacts;
    }

    public void meth(){
        System.out.println("doesn't do much");
    }
}
