package model;

import java.util.Arrays;

public class Tshirt {
    String name;
    int product_code;
    int price;
    String brand;
    String description;
    String[] size;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }
//for setting value
    public Tshirt(String name, int product_code, int price, String brand, String description, String[] size) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.size = size;
    }
    //display info
    public void Display_info(){
        String Name= this.name;
        int code= this.product_code;
        int Price= this.price;
        String Brand_name= this.brand;
        String Description= this.description;
        String[] S= this.size;

        System.out.println("Item name: "+Name+"\n\n Description:"+Description+"\n Product code: "+code+"\t Brand:"+Brand_name+"\n\nPrice: "+Price+"\nSize: "+ Arrays.toString(S));

    }
    //Describe tshirt
    public void describe() {
        System.out.println("Item name: " + name+"\nDescription: " + description+"\nProduct code: " + product_code+"\nBrand: " + brand+"\nPrice: " + price+"\nSizes: " + Arrays.toString(size));

    }
}
