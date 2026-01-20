package exercises;

import java.util.Scanner;

public class Exercise07 {
    public static final double BASE_SALARY = 6500.0;
    public static void main(String[] args) {
        /*
        Calculate Employee Salary Based on Working Seniority
        Problem
        Write a program to calculate the employee’s salary based on their working seniority (months of experience) using the following rule:
        Salary = coefficient × base salary
        Base salary = 6500 $
        Salary coefficient rules:
         + If working time < 12 months → coefficient = 1.92
         + If 12 ≤ working time < 36 months → coefficient = 2.34
         + If 36 ≤ working time < 60 months → coefficient = 3
         + If working time ≥ 60 months → coefficient = 4.5

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your working seniority (months of experience): ");
        int months = scanner.nextInt();


        double c;

        if (months < 0){
            System.out.println("Invalid! Please enter a positive value for your salary.");
            return;
        }else if (months < 12){
            c = 1.92;
        } else if (months < 36){
            c = 2.34;
        } else if (months < 60){
            c = 3;
        } else {
            c = 4.5;
        }
        double salary = BASE_SALARY * c;
        System.out.println("Your salary = $" + salary);
        scanner.close();
    }
}
