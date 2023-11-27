package homeworks;

import java.util.Scanner;

//Wap to find the K.E of given mass and velocity (input)
public class KE {
    public static void main (String[]args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter mass in kg: ");
        float mass = m.nextFloat();
        Scanner v = new Scanner(System.in);
        System.out.println("Enter velocity: ");
        float velocity = v.nextFloat();
        double KE= 0.5*mass*velocity*velocity;
        System.out.println("the KE of the body is:"+KE+"J");
    }
}
