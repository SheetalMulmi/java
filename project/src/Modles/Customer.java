package Modles;
import java.util.List;
public class Customer {
    String CName;
    int balance;
    String contact_info;

    List<Order> orderList;

    public Customer(String name, int balance, String contact_info) {
        CName = name;
        this.balance = balance;
        this.contact_info = contact_info;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getName() {
        return CName;
    }

    public void setName(String name) {
        CName = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }
}
