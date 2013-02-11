package impl;

import interfaces.Contact;

public class ContactImpl implements Contact {
    private int id;
    private String name;
    private String notes;

    public ContactImpl(int id, String name, String notes){
        this.id = id;
        this.name = name;
        this.notes = notes;
    }

    @Override
    public int getId() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getNotes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addNotes(String note) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
