package exercises;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();

        System.out.println("You entered: a = " + a + ", b = " + b);
        //placeholder
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("Swapped: a = " + a + ", b = " + b);

        scanner.close();
    }
}
