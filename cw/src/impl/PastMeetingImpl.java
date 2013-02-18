package impl;

import interfaces.Contact;
import interfaces.FutureMeeting;
import interfaces.PastMeeting;

import java.util.Calendar;
import java.util.Set;

public class PastMeetingImpl extends MeetingImpl implements PastMeeting{
    private String notes;

    public PastMeetingImpl(FutureMeeting m, String notes){
        super(m.getId(),m.getDate(),m.getContacts());
        this.notes = notes;
    }
    public PastMeetingImpl(Calendar date, Set<Contact> contacts){
        super(date,contacts);
    }
    @Override
    public String getNotes() {
        return notes;
    }


}
