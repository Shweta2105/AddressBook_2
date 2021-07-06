package AddressBook.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
@Author Shweta
AddressBook system
 */
public class AddressBook extends AddressBookInterface {

    Scanner scanner = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    List<ContactDetails> contact = new ArrayList<>();


    public static void main(String[] args) {
    //main method
            System.out.println("Welcome to Address Book Program");

            AddressBook addressBookObj = new AddressBook();
            addressBookObj.displayOptions();
            boolean condition = true;


    }

    private void displayOptions() {
        int option;
        int outerFlag = 0;
        while(outerFlag == 0) {
            System.out.println("Select from the following options:");
            System.out.println("1 for create new address book");
            System.out.println("2 for display all address books");
            System.out.println("3 for edit person details in address book");
            System.out.println("4 for delete an address book");
            System.out.println("0 for exit");
            System.out.println("Enter your choice: ");
            option = scanner.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Creating a new address book..");
                    System.out.println("Please provide the name for the address book: ");
                    String bookName = scanner.nextLine();
                    createBook(bookName, addressbooks);
                    break;

                case 2:
                    System.out.println("Displaying all address book(s)..");
                    displayAddressBooks(HashMap<String,ArrayList<contact>> );
                    System.out.println("Name of address books you want view information in: ");
                    String name = scanner.nextLine();

                    if(addressbooks.containsKey(name)) {
                        ArrayList<ContactDetails> records = addressbooks.get(name);
                    }
                    else {
                        System.out.println("Incorrect name entered.");
                        break;
                    }

                    display(records);
                    break;

                case 3:
                    System.out.println("Editing records in the address book..");
                    System.out.println("Displaying all address books");
                    displayAddressBooks(HashMap<String,ArrayList<contact>>);
                    System.out.println("Select from the address books list,");
                    System.out.println("Name of address books you want to alter information in: ");
                    String addressBookName = scanner.nextLine();


                    int choice;
                    int innerflag = 0;
                    while(innerflag == 0) {
                        System.out.println("Select from the following options:");
                        System.out.println("1 for add new person details in the address book");
                        System.out.println("2 for display list of persons in address book");
                        System.out.println("3 for edit person details in address book");
                        System.out.println("4 for delete a person in address book");
                        System.out.println("0 for exit");
                        System.out.println("Enter your choice: ");
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                scanner.nextLine();
                                System.out.println("Enter first name: ");
                                String fname = scanner.nextLine();
                                System.out.println("Enter last name: ");
                                String lname = scanner.nextLine();
                                System.out.println("Enter address: ");
                                String addr = scanner.nextLine();
                                System.out.println("Enter city: ");
                                String city = scanner.nextLine();
                                System.out.println("Enter state: ");
                                String state = scanner.nextLine();
                                System.out.println("Enter zip: ");
                                String zip = scanner.nextLine();
                                System.out.println("Enter phone no: ");
                                String mobno = scanner.nextLine();
                                System.out.println("Enter email ID: ");
                                String mail = scanner.nextLine();
                                Add(fname, lname, addr, city, state, mobno, zip,mail);
                                break;

                            case 2:
                                display(records);
                                break;

                            case 3:
                                scanner.nextLine();
                                System.out.println("Enter first name: ");
                                String fn = scanner.nextLine();
                                System.out.println("Enter last name: ");
                                String ln = scanner.nextLine();

                                int index = findIndex(records, fn, ln);
                                if(index == -1) {
                                    System.out.println("Record not found!");
                                    break;
                                }

                                int ch = 0;
                                while(ch != 6) {
                                    System.out.println("Select from the following options for editing:");
                                    System.out.println("1 for edit address");
                                    System.out.println("2 for edit state");
                                    System.out.println("3 for edit city");
                                    System.out.println("4 for edit pin");
                                    System.out.println("5 for edit phone number");
                                    System.out.println("6 for exit");
                                    System.out.println("Enter choice your: ");

                                    ch = scanner.nextInt();
                                    scanner.nextLine();
                                    switch(ch) {
                                        case 1:
                                            System.out.println("Enter address: ");
                                            addr = scanner.nextLine();
                                            edit(addr, "1", index);
                                            break;
                                        case 2:
                                            System.out.println("Enter state: ");
                                           state = scanner.nextLine();
                                            edit(state, "2", index);
                                            break;
                                        case 3:
                                            System.out.println("Enter city: ");
                                            city = scanner.nextLine();
                                            edit(city, "3", index);
                                            break;
                                        case 4:
                                            System.out.println("Enter zip: ");
                                            zip = scanner.nextLine();
                                            edit(zip, "4", index);
                                            break;
                                        case 5:
                                            System.out.println("Enter phone no: ");
                                            mobno = scanner.nextLine();
                                            edit(mobno, "5",index);
                                            break;
                                        case 6:
                                            System.out.println("Information edited successfully.");
                                            break;
                                        default:
                                            System.out.println("Invalid choice.");
                                            break;
                                    }
                                }
                                break;

                            case 4:
                                scanner.nextLine();
                                System.out.println("Enter first name: ");
                                String first = scanner.nextLine();
                                System.out.println("Enter last name: ");
                                String last = scanner.nextLine();

                                int indx = findIndex(records, first, last);
                                if(indx == -1) {
                                    System.out.println("Record not found!");
                                    break;
                                }
                                delete(first, last);
                                System.out.println("Record successfully deleted.");
                                break;

                            case 0:
                                innerflag = 1;
                                break;

                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Deleting the address book..");
                    System.out.println("Displaying all address books");
                    //list goes here
                    System.out.println("Select from the address books list,");
                    System.out.println("Name of address books you want to delete: ");
                    String addressBookNameD = scanner.nextLine();
                    break;

                case 0:
                    outerFlag = 1;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

    }
 }



