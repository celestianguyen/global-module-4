package exercises;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve for x the quadratic equation ax^2 + bx + c = 0");

        System.out.print("Please enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Please enter c: ");
        double c = scanner.nextDouble();

        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("x = 0");
                } else {
                    System.out.println("This equation has no solution");
                }
            } else {
                String solveForX = (c == 0) ? "x = 0" : "x = " + -b/a;
                System.out.println(solveForX);
            }
        }
    }
}
