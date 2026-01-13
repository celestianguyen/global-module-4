package exercises;

import java.util.Scanner;

public class Exercise09_CvUppercaseToLowercaseAndViceVersa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character that must be a letter: ");
        char input = scanner.next().charAt(0);

        if (input >= 'a' && input <= 'z'){
            char upper = Character.toUpperCase(input);
            System.out.println(upper);
        } else if (input >= 'A' && input <= 'Z'){
            char lower = Character.toLowerCase(input);
            System.out.println(lower);
        } else {
            System.out.println("Error! Please enter a letter char");
        }
        scanner.close();

    }
}
