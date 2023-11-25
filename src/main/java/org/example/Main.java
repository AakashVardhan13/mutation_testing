package org.example;
import java.util.Scanner;
import java.lang.Math;

public class Main {



    public static double add(double x, double y){

        return x + y;
    }

    public static double sub(double x, double y){

        return x - y;
    }

    public static double mul(double x, double y){

        return x * y;
    }

    public static double div(double x, double y){

        return x / y;
    }

    public static double mod(double x){
        if(x < 0) {
            return -x;
        }
        return x;
    }

    public static double ln(double x){
        return Math.log(x);
    }


    public static double e_power(double x){
        return Math.exp(x);
    }

    public static double fact(double x){
        double a=1,b=1;
        while(a < x+1){
            b=b*a;
            a++;
        }
        return b;
    }

    public static double power(double x, double y){
        return Math.round(e_power(y * ln(x))*1000000)/1000000;
    }

    public static void calculator(){

        double x,y;
        boolean flag = true;

        while(flag){

            System.out.println("-------Welcome to Calculator------");
            System.out.println("What do you want to do?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Absolute Value");
            System.out.println("6. natural logarithm");
            System.out.println("7. Power of 'e'");
            System.out.println("8. Integral Factorial");
            System.out.println("9. Exponent");
            System.out.println("10. Exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Enter First Number: ");
                    x = sc.nextDouble();
                    System.out.println("Enter Second Number: ");
                    y = sc.nextDouble();
                    System.out.println("Result: " + add(x, y));
                    break;

                case 2:
                    System.out.println("Enter First Number: ");
                    x = sc.nextDouble();
                    System.out.println("Enter Second Number: ");
                    y = sc.nextDouble();
                    System.out.println("Result: " + sub(x, y));
                    break;

                case 3:
                    System.out.println("Enter First Number: ");
                    x = sc.nextDouble();
                    System.out.println("Enter Second Number: ");
                    y = sc.nextDouble();
                    System.out.println("Result: " + mul(x, y));
                    break;

                case 4:
                    System.out.println("Enter First Number: ");
                    x = sc.nextDouble();
                    System.out.println("Enter Second Number: ");
                    y = sc.nextDouble();
                    System.out.println("Result: " + div(x, y));
                    break;

                case 5:
                    System.out.println("Enter Number: ");
                    x = sc.nextDouble();
                    System.out.println("Result: " + mod(x));
                    break;

                case 6:
                    System.out.println("Enter Number: ");
                    x = sc.nextDouble();
                    System.out.println("Result: " + ln(x));
                    break;

                case 7:
                    System.out.println("Enter Number: ");
                    x = sc.nextDouble();
                    System.out.println("Result: " + e_power(x));
                    break;

                case 8:
                    System.out.println("Enter Number: ");
                    x = sc.nextDouble();
                    System.out.println("Result: " + fact(x));
                    break;

                case 9:
                    System.out.println("Enter Base: ");
                    x = sc.nextDouble();
                    System.out.println("Enter Power: ");
                    y = sc.nextDouble();
                    System.out.println("Result: " + power(x, y));
                    break;

                case 10:
                    System.out.println("Thanks you");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Input!");
                    break;
            }

            System.out.println();
            System.out.println();
        }
    }


    public static void main(String[] args) {

        calculator();
    }
}