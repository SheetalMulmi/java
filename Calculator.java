package homeworks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner num1= new Scanner(System.in);
        System.out.println("enter the first number:");
        float x= num1.nextFloat();
        Scanner num2= new Scanner(System.in);
        System.out.println("enter the second number:");
        float y= num2.nextFloat();
        Scanner op= new Scanner(System.in);
        System.out.println("enter the operator(+,-,*,/):");
        char operator= op.next().charAt(0);
        if (operator=='+'){
            System.out.println(x+y);
        } else if (operator=='-') {
            System.out.println(x-y);
        } else if (operator=='*') {
            System.out.println(x*y);
        } else if (operator=='/') {
            System.out.println(x/y);
        }else {
            System.out.println("Invalid");
        }
    }
}
