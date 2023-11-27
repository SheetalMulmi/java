package homeworks;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[]args) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("enter your num: ");
        int num = n1.nextInt();
        if (num%3==0&&num%5==0) {
            System.out.println("Fizzbuzz");
        }else if (num%3==0){
            System.out.println("Fizz");
        } else if (num%5==0) {
            System.out.println("Buzz");
        }else {
            System.out.println("no");
        }
    }
}
