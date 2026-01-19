package exercises;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve for x the quadratic equation ax^2 + bx + c = 0");

        System.out.print("Please enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Please enter c: ");
        double c = scanner.nextDouble();

        if (a == 0){
            if (b == 0){
                String s = (c == 0) ? "x has indefinite solutions" : "This equation has no solution";
                System.out.println(s);
            } else {
                String solveForX = (c == 0) ? "x = 0" : "x = " + -b/a;
                System.out.println(solveForX);
            }
        } else {
            double delta = Math.pow(b,2.0) - 4*a*c;
            if (delta < 0){
                System.out.println("the equation has no solution");
            } else if (delta == 0){
                System.out.println("the equation has one solution: x = " + (-b)/(2*a));
            } else {
                System.out.println("the equation has 2 distinct solutions: ");
                System.out.println("x1 = " +  (-b - sqrt(delta))/(2*a));
            }
        }
        scanner.close();
    }
}
