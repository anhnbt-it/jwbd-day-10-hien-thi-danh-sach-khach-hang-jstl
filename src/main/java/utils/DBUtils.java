package utils;

import beans.Customer;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

public class DBUtils {
    static Set<Customer> customers;

    static {
        try {
            initData();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void initData() throws ParseException {
        customers = new HashSet<>();
        customers.add(new Customer("Nguyen Ba Tuan Anh", "1995/11/16", "Ha Noi", "avatar.JPG"));
        customers.add(new Customer("Nguyen Ba Tuan Anh", "1995/11/16", "Ha Noi", "avatar.JPG"));
        customers.add(new Customer("Nguyen Ba Tuan Anh", "1995/11/16", "Ha Noi", "avatar.JPG"));
        customers.add(new Customer("Nguyen Ba Tuan Anh", "1995/11/16", "Ha Noi", "avatar.JPG"));
        customers.add(new Customer("Nguyen Ba Tuan Anh", "1995/11/16", "Ha Noi", "avatar.JPG"));
    }

    public static Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        if (this.customers == null) {
            this.customers = new HashSet<>();
        }
        this.customers.add(customer);
    }
}
