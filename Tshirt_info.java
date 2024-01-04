import model.Tshirt;
import model.Order;

public class Tshirt_info {
    public static void main(String[] args) {
        String[] size1 ={"XS","s","M","L","XL","XXL"};
        //giving value
        Tshirt item1=new Tshirt("Gorkhali Batman",572,1235,"Karuna","Graphic text: You either die a hero or live long enough to see yourself be a villain"
        ,size1);
        //describe t-shirt
        item1.describe();
        item1.Display_info();

        int[] items={572};
        int[] price= {1235};
        //giving value
        Order person1= new Order("Ram Lama","9851163451",items,price);
        //print bill
        person1.Bill();
    }
}
