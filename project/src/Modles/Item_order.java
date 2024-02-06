package Modles;

public class Item_order {
    item item;
    int quantity;

    public Item_order(item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public item getItem() {
        return item;
    }

    public void setItem(item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
