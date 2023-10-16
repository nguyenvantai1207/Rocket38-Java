package com.vti.entity;

import java.util.ArrayList;
import java.util.Iterator;

public class VietnamesePhone extends Phone{
    private ArrayList<Contact> contacts;
    public VietnamesePhone() {
        this.contacts = new ArrayList<>();
    }

    @Override
    public void insertContact(String name, String phone) {
        contacts.add(new Contact(name,phone));
    }

    @Override
    public void removeContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while(iterator.hasNext())
        {
            Contact contact = iterator.next();
            if(contact.getName().equals(name))
            {
                iterator.remove();
            }
        }
    }

    @Override
    public void updateContact(String name, String newPhone) {
        contacts.forEach(contact -> {
            if(contact.getName().equals(name)){
                contact.setNumber(newPhone);
            }
        });
    }

    @Override
    public void searchContact(String name) {
        for(Contact contact : contacts)
        {
            if(contact.getName().equals(name))
            {
                System.out.println(contact);
            }
        }
    }

    public void printContact(){
        for(Contact contact : contacts)
        {
            System.out.println(contact);
        }
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
}
