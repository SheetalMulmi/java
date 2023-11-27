package homeworks;

import java.util.Scanner;
//wap to convert a given days into seconds and min.
public class Days_sec_min {
    public static void main (String[]args){
        Scanner d1 = new Scanner(System.in);
        System.out.println("Enter day: ");
        int days = d1.nextInt();
        //for seconds
        int sec= days*24*60*60;
        //for min
        int min= days*24*60;
        System.out.println("the seconds are:"+sec);
        System.out.println("the minutes are:" +min);
    }
}
