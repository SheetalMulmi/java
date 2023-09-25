import java.util.Scanner;

public class Bill {
    public static void main(String[]args) {
        Scanner i = new Scanner(System.in);
        System.out.println("How many items do you have(not more than 3 items): ");
        int item = i.nextInt();

        if (item==1) {
            Scanner i1= new Scanner(System.in);
            System.out.println("enter your 1st item: ");
            String item1= i1.nextLine();
            Scanner p1= new Scanner(System.in);
            System.out.println("enter the price of 1st item:");
            float price1= p1.nextFloat();
            Scanner q1= new Scanner(System.in);
            System.out.println("Enter the quantity 1st item you took: ");
            int Qty1= q1.nextInt();
            float prc1= price1*Qty1;
            Scanner m = new Scanner(System.in);
            System.out.println("Do you have a membership(1yes and 2 no): ");
            int mem = m.nextInt();
            if (mem == 1) {
                float Tol= prc1;
                float Dis= 10*Tol/100;
                float total= Tol-Dis;
                System.out.println("as you have 10% discount your total bill is");
                System.out.println("\t\ttxys\n name\t Qty\t rate\t amt \n"+item1+"\t "+Qty1+"\t "+price1+"\t "+prc1+"\n \t\t\t total:"+Tol+"\n \t\t\t Discount:"+Dis+"\n \t\t\t total:"+total);

            } else if (mem==2) {
                float tol= prc1;
                System.out.println("\t\ttxys\n name\t Qty\t rate\t amt \n"+item1+"\t "+Qty1+"\t "+price1+"\t "+prc1+"\n \t\t\t total:"+tol);
            }else {
                System.out.println("retry");
            }

        } else if (item==2) {
            Scanner i21= new Scanner(System.in);
            System.out.println("enter your 1st item: ");
            String item21= i21.nextLine();
            Scanner p21= new Scanner(System.in);
            System.out.println("enter the price of 1st item:");
            float price21= p21.nextFloat();
            Scanner q21= new Scanner(System.in);
            System.out.println("Enter the quantity 1st item you took: ");
            int Qty21= q21.nextInt();
            Scanner i22= new Scanner(System.in);
            System.out.println("enter your 2nd item: ");
            String item22= i22.nextLine();
            Scanner p22= new Scanner(System.in);
            System.out.println("enter the price of 2nd item:");
            float price22= p22.nextFloat();
            Scanner q22= new Scanner(System.in);
            System.out.println("Enter the quantity 2nd item you took: ");
            int Qty22= q22.nextInt();
            float prc21= price21*Qty21;
            float prc22= price22*Qty22;
            Scanner m = new Scanner(System.in);
            System.out.println("Do you have a membership(1yes and 2 no): ");
            int mem = m.nextInt();
            if (mem == 1) {
                float tol2= prc21+prc22;
                float Dis2= 10*tol2/100;
                float total2= tol2-Dis2;
                System.out.println("as you have 10% discount your total bill is");
                System.out.println("\t\ttxys\n name\t Qty\t rate\t amt \n"+item21+"\t "+Qty21+"\t "+price21+"\t "+prc21+"\n "+item22+"\t "+Qty22+"\t "+price22+"\t "+prc22+"\n \t\t\t total:"+tol2+"\n \t\t\t Discount:"+Dis2+"\n \t\t\t total:"+total2);

            } else if (mem==2) {
                float tol2= prc21+prc22;
                System.out.println("\t\ttxys\n name\t Qty\t rate\t amt \n"+item21+"\t "+Qty21+"\t "+price21+"\t "+prc21+"\n "+item22+"\t "+Qty22+"\t "+price22+"\t "+prc22+"\n \t\t\t total:"+tol2);
            }else {
                System.out.println("retry");
            }
        } else if (item==3) {
            Scanner i31= new Scanner(System.in);
            System.out.println("enter your 1st item: ");
            String item31= i31.nextLine();
            Scanner p31= new Scanner(System.in);
            System.out.println("enter the price of 1st item:");
            float price31= p31.nextFloat();
            Scanner q31= new Scanner(System.in);
            System.out.println("Enter the quantity 1st item you took: ");
            int Qty31= q31.nextInt();
            Scanner i32= new Scanner(System.in);
            System.out.println("enter your 2nd item: ");
            String item32= i32.nextLine();
            Scanner p32= new Scanner(System.in);
            System.out.println("enter the price of 2nd item:");
            float price32= p32.nextFloat();
            Scanner q32= new Scanner(System.in);
            System.out.println("Enter the quantity 2nd item you took: ");
            int Qty32= q32.nextInt();
            Scanner i33= new Scanner(System.in);
            System.out.println("enter your 3rd item: ");
            String item33= i33.nextLine();
            Scanner p33= new Scanner(System.in);
            System.out.println("enter the price of 3rd item:");
            float price33= p33.nextFloat();
            Scanner q33= new Scanner(System.in);
            System.out.println("Enter the quantity 3rd item you took: ");
            int Qty33= q33.nextInt();
            float prc31= price31*Qty31;
            float prc32= price32*Qty32;
            float prc33= price33*Qty33;
            Scanner m = new Scanner(System.in);
            System.out.println("Do you have a membership(1yes and 2 no): ");
            int mem = m.nextInt();
            if (mem == 1) {
                float tol3= prc31+prc32+prc33;
                float Dis3= 10*tol3/100;
                float total3= tol3-Dis3;
                System.out.println("as you have 10% discount your total bill is");
                System.out.println("\t\ttxys\n name\t Qty\t rate\t amt \n"+item31+"\t "+Qty31+"\t "+price31+"\t "+prc31+"\n "+item32+"\t "+Qty32+"\t "+price32+"\t "+prc32+"\n "+item33+"\t "+Qty33+"\t "+price33+"\t "+prc33+"\n \t\t\t total:"+tol3+"\n \t\t\t Discount:"+Dis3+"\n \t\t\t total:"+total3);

            } else if (mem==2) {
                float tol3= prc31+prc32+prc33;
                System.out.println("\t\ttxys\n name\t Qty\t rate\t amt \n"+item31+"\t "+Qty31+"\t "+price31+"\t "+prc31+"\n "+item32+"\t "+Qty32+"\t "+price32+"\t "+prc32+"\n "+item33+"\t "+Qty33+"\t "+price33+"\t "+prc33+"\n \t\t\t total:"+tol3);
            }else {
                System.out.println("retry");
            }
        }else {
            System.out.println("retry");
        }


    }
}
