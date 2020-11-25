package beans;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String name;
    private Date dateOfBirth;
    private String address;
    private String avatar;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public Customer() {
    }

    public Customer(String name, String dateOfBirthStr, String address, String avatar) throws ParseException {
        this.name = name;
        this.dateOfBirth = dateFormat.parse(dateOfBirthStr);
        this.address = address;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDateToString() {
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        return format.format(this.dateOfBirth);
    }

    @Override
    public String toString() {
        return "beans.Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
