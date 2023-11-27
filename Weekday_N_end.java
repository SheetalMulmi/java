package homeworks;

import java.util.Scanner;

public class Weekday_N_end {
    public static void main(String[]args){
        Scanner d1= new Scanner(System.in);
        System.out.println("enter your day num: ");
        int day= d1.nextInt();
        switch (day){
            case 1:
                System.out.println("Weekend Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println(" Weekend Saturday");
                break;
        }
    }

}
