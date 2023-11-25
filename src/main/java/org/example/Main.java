package org.example;
import java.util.Scanner;

public class Main {



    public static int add(int x, int y){

        return x + y;
    }

    public static int sub(int x, int y){

        return x - y;
    }

    public static int mul(int x, int y){

        return x * y;
    }

    public static int div(int x, int y){

        return x / y;
    }


    public static void main(String[] args) {

        int a1,a2,s1,s2,m1,m2,d1,d2;
        boolean flag = true;

        while(flag){

            System.out.println("-------Welcome to Calculator------");
            System.out.println("What do you want to do?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Enter First Number: ");
                    a1 = sc.nextInt();
                    System.out.println("Enter Second Number: ");
                    a2 = sc.nextInt();
                    System.out.println("Result: " + add(a1, a2));
                    break;

                case 2:
                    System.out.println("Enter First Number: ");
                    s1 = sc.nextInt();
                    System.out.println("Enter Second Number: ");
                    s2 = sc.nextInt();
                    System.out.println("Result: " + sub(s1, s2));
                    break;

                case 3:
                    System.out.println("Enter First Number: ");
                    m1 = sc.nextInt();
                    System.out.println("Enter Second Number: ");
                    m2 = sc.nextInt();
                    System.out.println("Result: " + mul(m1, m2));
                    break;

                case 4:
                    System.out.println("Enter First Number: ");
                    d1 = sc.nextInt();
                    System.out.println("Enter Second Number: ");
                    d2 = sc.nextInt();
                    System.out.println("Result: " + div(d1, d2));
                    break;

                case 5:
                    System.out.println("Thanks you");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }
}