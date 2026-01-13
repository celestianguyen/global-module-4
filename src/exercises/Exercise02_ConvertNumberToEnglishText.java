package exercises;

import java.util.Scanner;

public class Exercise02_ConvertNumberToEnglishText {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a natural number from 1 - 10: ");
        int input = scanner.nextInt();

        //way 1: using if-else
        if (input == 1){
            System.out.println("one");
        } else if (input == 2) {
            System.out.println("two");
        } else if (input == 3) {
            System.out.println("three");
        } else if (input == 4) {
            System.out.println("four");
        } else if (input == 5) {
            System.out.println("five");
        } else if (input == 6) {
            System.out.println("six");
        } else if (input == 7) {
            System.out.println("seven");
        } else if (input == 8) {
            System.out.println("eight");
        } else if (input == 9) {
            System.out.println("nine");
        } else if (input == 10) {
            System.out.println("ten");
        } else {
            System.out.println("invalid number");
        }

        //way 2: switch

        switch (input) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("invalid number");
        }
        scanner.close();
    }
}
