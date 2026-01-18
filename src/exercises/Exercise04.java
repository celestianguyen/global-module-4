package exercises;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter integer b: ");
        int b = scanner.nextInt();

        if (a < b){
            System.out.println("largest number: " + b + ", smallest number: " + a);
        } else {
            System.out.println("largest number: " + a + ", smallest number: " + b);
        }

        scanner.close();

    }
}
