import Modles.Item_order;
import Modles.Order;
import Modles.item;
import Modles.Customer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ram", 6600,"9823549536");
        Customer c2= new Customer("Hari",4000,"9845256792");
        item i1 = new item("momo", 100);
        item i2 = new item("pizza", 540);
        item i3= new item("burger",230);

        Item_order item1 = new Item_order(i1,2);
        Item_order item2 = new Item_order(i2,1);
        Item_order item3= new Item_order(i3,2);
        List<Item_order> io1 = new ArrayList<>();
        io1.add(item1);
        io1.add(item2);
        List<Item_order> io2 = new ArrayList<>();
        io2.add(item3);
        Order order1 = new Order(1,io1);
        Order order2= new Order(2,io2);
        List<Order> c1order = new ArrayList<>();
        c1order.add(order1);
        List<Order> c2order = new ArrayList<>();
        c2order.add(order2);
        c1.setOrderList(c1order);
        c2.setOrderList(c2order);



        System.out.println("Orders");

        for(Order ordera: c1.getOrderList()){
//
            System.out.println("OrderId: "+ordera.getOrderId());
            System.out.println("Name \t \t \t \t Quantity");
            for(Item_order itemOrder: ordera.getItemOrderList()){

                System.out.println(itemOrder.getItem().getName()+"\t \t \t \t"+itemOrder.getQuantity());

            }

            for(Order ord2: c2.getOrderList()){
                System.out.println("OrderId: "+ord2.getOrderId());
                System.out.println("Name \t \t \t \t Quantity");
                for(Item_order itemOrder: ord2.getItemOrderList()){

                    System.out.println(itemOrder.getItem().getName()+"\t \t \t \t"+itemOrder.getQuantity());

                }
        }
    }
}
}