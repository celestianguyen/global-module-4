package exercises;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        /*
        Determine the Number of Days in a Month
        Problem
        Input a month and a year. Print how many days that month has in that specific year.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = scanner.nextInt();

        System.out.print("Please enter a month in the year you just entered: ");
        int month = scanner.nextInt();
        if (month < 0 || month > 12){
            System.out.println("Please enter a valid month!");
            return;
        }
        boolean isLeap = ((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0);


        if (month == 2){
            if (isLeap){
                System.out.println("The month you just entered has 29 days.");
            } else {
                System.out.println("The month you just entered has 28 days.");
            }
        } else if (month == 4 || month == 6 || month == 1 || month == 9 || month == 11){
            System.out.println("The month you just entered has 30 days.");
        } else {
            System.out.println("The month you just entered has 31 days.");
        }
    }
}
