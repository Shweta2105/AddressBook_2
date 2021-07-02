package AddressBook.main;

public class ContactDetails {
    private String fname;
    private String lname;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String mobno;
    private String mail;



    public ContactDetails(String fname, String lname, String address, String city, String state, String zip, String mobno,String mail) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobno = mobno;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", mobno='" + mobno + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
