package AddressBook.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookInterface {
    ArrayList<ContactDetails> records = new ArrayList<ContactDetails>();
    HashMap<String, ArrayList<ContactDetails>> addressbooks = new HashMap<String, ArrayList<ContactDetails>>();

    public void createBook(String bookName, HashMap<String, ArrayList<ContactDetails>> addressBooks) {
        if (addressBooks.containsKey(bookName)) {
            System.out.println("Address book with the same name already exist.");
            System.out.println("Provide different name: ");
            Scanner scanner = null;
            bookName = scanner.nextLine();
        } else
            addressBooks.put(bookName, new ArrayList<ContactDetails>());
    }

    public void Add(String firstName, String lastName, String address, String city, String state, String mobno,
                    String zip, String email) {
        ContactDetails person = new ContactDetails(firstName, lastName, address, city, state,mobno, zip,email);
        int result = person.findMobNo(records, mobno);
        if (result != -1) {
            System.out.println("The address book already has details with " + mobno + " this phone number.");
        } else {
            records.add(person);
            System.out.println();
            System.out.println("Information added successfully.\n");
        }
    }
    public static int findIndex(ArrayList<ContactDetails> records, String fname, String lname) {
        for (int i = 0; i < records.size(); i++) {
            String f = records.get(i).getFname();
            String l = records.get(i).getLname();
            if (f.equals(fname) && l.equals(lname)) {
                return i;
            }
        }
        return -1;
    }
    void display(ArrayList<ContactDetails> arr) {
        boolean isEmpty = arr.isEmpty();
        if (isEmpty == true) {
            System.out.println("No record(s) found \n");
        } else {
            System.out.println(arr);
            System.out.println();
        }
    }

    void edit(String value, String option, int index) {
        ContactDetails personObj = records.get(index);
        if (option == "1") {
            personObj.setAddress(value);
        } else if (option == "2") {
            personObj.setCity(value);
        } else if (option == "3") {
            personObj.setState(value);
        } else if (option == "4") {
            personObj.setMobno(value);
        } else if (option == "5") {
            personObj.setZip(value);
        }
        records.set(index, personObj);
    }
    public void delete(String fname, String lname) {
        int size = records.size();
        for (int i = 0; i < size; i++) {
            String f = records.get(i).getFname();
            String l = records.get(i).getLname();
            if (f.equals(fname) && l.equals(lname)) {
                records.remove(i);
                break;
            }
        }
    }

    public void displayAddressBooks(HashMap<String, ArrayList<ContactDetails>> addressBooks) {
        boolean is_Empty = addressBooks.isEmpty();
        if (is_Empty == true) {
            System.out.println("No record(s) found.");
        } else {
            System.out.println(addressBooks);
            System.out.println();
        }
    }
    public void editAddressBook(HashMap<String, ArrayList<ContactDetails>> addressBooks, String addressBookName) {
        ArrayList<ContactDetails> records = addressBooks.get(addressBookName);
    }

}
