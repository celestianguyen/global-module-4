package exercises;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve ax + b = 0");
        System.out.print("Please enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter b: ");
        double b = scanner.nextDouble();


        if (a == 0){
            if (b == 0){
                System.out.println("x = 0");
            } else {
                System.out.println("This equation has no solution");
            }
        } else {
            String solveForX = (b == 0) ? "x = 0" : "x = " + -b/a;
            System.out.println(solveForX);
        }
        scanner.close();
    }
}
