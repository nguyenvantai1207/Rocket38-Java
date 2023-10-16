package com.vti.frontend;

import com.vti.entity.Contact;
import com.vti.entity.VietnamesePhone;

import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        VietnamesePhone vnp = new VietnamesePhone();

        System.out.println("Before update number: ");
        vnp.insertContact("John Doe", "+1 (123) 456-7890");
        vnp.insertContact("Jane Smith", "+1 (555) 123-4567");
        vnp.insertContact("Alice Johnson", "+1 (987) 654-3210");

        vnp.printContact();

        vnp.updateContact("John Doe", "0378999111");

        System.out.println("After update number: ");
        vnp.printContact();

        System.out.println("Searched contact is: ");
        vnp.searchContact("John Doe");

        System.out.println("After removed contact include: ");
        vnp.removeContact("John Doe");
        vnp.printContact();


    }


}
