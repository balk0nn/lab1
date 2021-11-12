import java.io.IOException;

import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a;
            System.out.println("Please enter 4 more numbers!");
                while (!scan.hasNextInt()) {
                    System.out.println("That's not a number!");
                    scan.next();
                }
            a = scan.nextInt();
        System.out.println("Thank you! Got " + a);
        int b;
            System.out.println("Please enter 3 more numbers!");
                while (!scan.hasNextInt()) {
                    System.out.println("That's not a number!");
                    scan.next();
                }
        b = scan.nextInt();
        System.out.println("Thank you! Got " + b);
        int c;
            System.out.println("Please enter 2 more numbers!");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next();
            }
        c = scan.nextInt();
        System.out.println("Thank you! Got " + c);
        int d;
            System.out.println("Please enter 1 more number!");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a number!");
                scan.next();
            }
        d = scan.nextInt();
        System.out.println("Thank you! Got " + d);

        if((a > b) & (a > c) &( a > d)){
            System.out.println("The largest number was  " + a);
            }
        if((b > a) & (b > c) & (b > d)){
            System.out.println("The largest number was  " + b);
        }
        if((c > a) & (c > b) & (c > d)){
            System.out.println("The largest number was  " + c);
        }
        if((d > a) & (d > b) & (d > c)){
            System.out.println("The largest number was  " + d);
        }
        }
    }