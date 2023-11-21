package homeworks;

import java.util.Scanner;

public class Guess_game {
    public static void main(String[]args){
        Scanner num1= new Scanner(System.in);
        System.out.println("enter a number:");
        int x= num1.nextInt();
        int num = 55;
        while (x!= num) {
            Scanner num2 = new Scanner(System.in);
            System.out.println("enter a number again:");
            int y = num2.nextInt();
            if (y == num) {
                System.out.println("done");
            }else if(y<num) {
                System.out.println("no higher");
            }else{
                System.out.println("no lower");
            }x=y;
        }
    }
}
