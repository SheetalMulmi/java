package Modles;
import java.util.Date;
import java.util.List;
public class Order {
    int orderId;
    Date date;
    List<Item_order> itemOrderList;

    public Order(int orderId, List<Item_order> itemOrderList) {
        this.orderId = orderId;
        this.itemOrderList = itemOrderList;
    }

    public int getOrderId() {

        return orderId;
    }

    public void setOrderId(int orderId) {

        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Item_order> getItemOrderList() {
        return itemOrderList;
    }

    public void setItemOrderList(List<Item_order> itemOrderList) {
        this.itemOrderList = itemOrderList;
    }
}
