package model;
import java.util.Arrays;
public class Order {
    String person_name;
    String phone_no;
    int[] item;
    int[] price;



    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public int[] getItem() {
        return item;
    }

    public void setItem(int[] item) {
        this.item = item;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }
    //for setting value

    public Order(String person_name, String phone_no, int[] item, int[] price) {
        this.person_name = person_name;
        this.phone_no = phone_no;
        this.item = item;
        this.price = price;
    }
    //for bill
    public void Bill() {
        double total = 0;
        for (double prices : price) {
            total += prices;
        }
        double vat = total * 0.13;
        System.out.println("Order details:");
        System.out.println("Name: " + person_name);
        System.out.println("Phone number: " + phone_no);
        System.out.println("Items: " + Arrays.toString(item));
        System.out.println("Prices: " + Arrays.toString(price));
        System.out.println("Total price: " + total);
        System.out.println("VAT (13%): " + vat);
        System.out.println("Total price with VAT: " + (total + vat));
    }
}


