package exercises;

import java.util.Scanner;

public class Exercise10_Check_Perfect_Square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int x = scanner.nextInt();
        double squareRoot = (double) Math.sqrt(x);

        if (squareRoot - (int)squareRoot == 0){
            System.out.println(x + " is a perfect square.");
        } else {
            System.out.println(x + " is not a perfect square.");
        }



        scanner.close();
    }
}
