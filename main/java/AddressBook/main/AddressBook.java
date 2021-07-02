package AddressBook.main;

import java.util.ArrayList;
import java.util.List;

/*
@Author Shweta
AddressBook system
 */
public class AddressBook {
    public static void main(String[] args) {
    //main method
        System.out.println("------------------Welcome to AddressBook------------------");
        //UC1
        List<ContactDetails> contact = new ArrayList<>();
        contact.add(new ContactDetails("Shweta","Pawar",
                "ChandaniChowk","Pune","Maharashtra","411037","9745789761","shiv@gmail.com"));
        contact.add(new ContactDetails("kiran","Joshi",
                "Paravti","Pune","Maharashtra","411044","97496089761","kiran@gmail.com"));

        System.out.println(contact);
        //UC2 add new contact
        contact.add(new ContactDetails("shubh","Prasad","Janakpuri","prayagraj","UP","986511","4567809898","shubh@labh.com"));
        System.out.println(contact);


    }
}
