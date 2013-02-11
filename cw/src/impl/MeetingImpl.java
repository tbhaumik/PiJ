package impl;

import interfaces.Contact;
import interfaces.Meeting;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

public  abstract class MeetingImpl implements Meeting, Serializable {
    @Override
    public int getId() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Calendar getDate() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Set<Contact> getContacts() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
