package exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve ax + b = 0");
        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();


        if (a == 0){
            if (b == 0){
                System.out.println("x = 0");
            } else {
                System.out.println("This equation has no solution");
            }
        } else {
            if (b == 0){
                System.out.println("x = 0");
            } else {
                System.out.println("x = " + (double)-b/a);
            }
        }
        scanner.close();
    }
}
