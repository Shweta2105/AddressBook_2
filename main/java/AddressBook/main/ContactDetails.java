package AddressBook.main;

import java.util.ArrayList;

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

    public String getFname() { return fname; }

    public void setFname(String fname) { this.fname = fname; }

    public String getLname() { return lname; }

    public void setLname(String lname) { this.lname = lname; }

    public String getAddress() { return address;  }

    public void setAddress(String address) {   this.address = address; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city;    }

    public String getState() { return state;    }

    public void setState(String state) {  this.state = state;    }

    public String getZip() { return zip; }

    public void setZip(String zip) {  this.zip = zip; }

    public String getMobno() { return mobno; }

    public void setMobno(String mobno) { this.mobno = mobno;    }

    public String getMail() { return mail; }

    public void setMail(String mail) { this.mail = mail;  }

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

    public int findMobNo(ArrayList<ContactDetails> records, String phoneNumber) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getMobno().equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

}
