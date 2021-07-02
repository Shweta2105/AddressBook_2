package AddressBook.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@Author Shweta
AddressBook system
 */
public class AddressBook implements AddressBookInterface {

    Scanner scanner = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    List<ContactDetails> contact = new ArrayList<>();

    public void add() {
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your address");
        String address = scanner.nextLine();
        System.out.println("Enter your city");
        String city = scanner.nextLine();
        System.out.println("Enter your state");
        String state = scanner.nextLine();
        System.out.println("Enter your phone");
        String mobileNo = scanner.nextLine();
        System.out.println("Enter your zip code");
        String zip = scanner.nextLine();
        System.out.println("Enter your Email ID ");
        String mail = scanner.nextLine();

        ContactDetails person1 = new ContactDetails(firstName, lastName, address, city, state, mobileNo, zip,mail);
        contact.add(person1);
        System.out.println("Contact added successfully");
    }

    public void display() {
        for (int i = 0; i < contact.size(); i++) {
            ContactDetails person = contact.get(i);
            System.out.println("FirstName:" + person.getFname() + "\n" + "LastName:" + person.getLname() + "\n"
                    + "Address:" + person.getAddress() + "\n" + "City:" + person.getCity() + "\n" + "State:"
                    + person.getCity() + "Phone-Number:" + person.getMobno() + "\n" + "Zip-code:"
                    + person.getZip()+"\n"+"Email ID: "+person.getMail());
        }
    }

    public void edit(String firstName) {
        for (int i = 0; i < contact.size(); i++) {
            ContactDetails person = contact.get(i);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hi " + person.getFname() + " please enter your  new Address");
            String address = scanner.nextLine();
            person.setAddress(address);

            System.out.println("Hi " + person.getFname() + " please enter your  new city");
            String city = scanner.nextLine();
            person.setCity(city);

            System.out.println("Hi " + person.getFname() + " please enter your  new state");
            String state = scanner.nextLine();
            person.setState(state);

            System.out.println("Hi " + person.getFname() + " please enter your  new Zip Code");
            String zip = scanner.nextLine();
            person.setZip(zip);

            System.out.println("Hi " + person.getFname() + " please enter your  new Phone No");
            String PhoneNo = scanner.nextLine();
            person.setMobno(PhoneNo);

            System.out.println("Hi " + person.getFname() + " you have successfully updated");
        }

    }
    private void delete(String name) {
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFname().equals(name)) {
                ContactDetails person = contact.get(i);
                contact.remove(person);
            }
        }
    }
    public void addMultiplePerson() {

        System.out.println("Enter a person Name:");
        String firstName = sc.nextLine();
        for (int i = 0; i < contact.size(); i++) {
            ContactDetails person = contact.get(i);
            if (contact.get(i).getFname().equals(firstName)) {
                System.out.println("Duplicate");
            }
        }
    }
    public static void main(String[] args) {
    //main method
            System.out.println("Welcome to Address Book Program");

            AddressBook adressBookObj = new AddressBook();
            boolean condition = true;

            while (condition == true) {
                Scanner scanner = new Scanner(System.in);
                Scanner option = new Scanner(System.in);
                System.out.println("1.Add Person" + "\n" + "2.Display" + "\n" + "3.Edit person" + "\n"+"4.Delete person"
                +"\n"+"5. Add MultipleContact");

                switch (option.nextInt()) {
                    case 1:
                        adressBookObj.add();
                        break;
                    case 2:
                        adressBookObj.display();
                        break;
                    case 3:
                        System.out.println("Enter the firstName:");
                        String firstName = scanner.nextLine();
                        adressBookObj.edit(firstName);
                        break;
                    case 4:
                        System.out.println("Enter the Name of the person do you wants to delete");
                        String name = scanner.nextLine();
                        adressBookObj.delete(name);
                        break;
                    case 5:
                        adressBookObj.addMultiplePerson();
                        break;
                    default:
                        System.out.println("Thank You");
                        break;
                }
            }
    }


}
