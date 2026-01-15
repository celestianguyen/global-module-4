package exercises;

import java.util.Scanner;

public class CheckNextPrevDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter day: ");
        int day = scanner.nextInt();
        System.out.print("Please enter month: ");
        int month = scanner.nextInt();
        System.out.print("Please enter year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int maxDays = 0;

        //Validate month
        if (month < 1 || month >12){
            System.out.println("Invalid date");
        }

        //validate day
        if (month == 2){
            maxDays = isLeapYear ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            maxDays = 30;
        } else {
            maxDays = 31;
        }

        if (day < 1 || day > maxDays){
            System.out.println("Invalid date");
            return;
        }

        System.out.println("Valid date:" + day + "/" + month + "/" + year);

        //Find next day
        int nextDay;
        int nextMonth;
        int nextYear;
        if (day == maxDays){
            nextDay = 1;
            nextMonth = month + 1;
            if (month == 12){
                nextYear = year + 1;
            } else {
                nextYear = year;
            }

        } else {
            nextDay = day + 1;
            nextMonth = month;
            nextYear = year;
        }

        System.out.println("Next day: " + nextDay + "/" + nextMonth + "/" + nextYear);

        //previous day
        int prevDay = day - 1;
        int prevMonth = month;
        int prevYear = year;

        if (prevDay < 1){
            prevMonth--;

            if (prevMonth < 1) {
                prevMonth = 12;
                prevYear--;
            }

            if (prevMonth == 2) {
                boolean prevLeapYear =
                        (prevYear % 4 == 0 && prevYear % 100 != 0)
                                || (prevYear % 400 == 0);
                prevDay = prevLeapYear ? 29 : 28;
            } else if (prevMonth == 4 || prevMonth == 6
                    || prevMonth == 9 || prevMonth == 11) {
                prevDay = 30;
            } else {
                prevDay = 31;
            }
        }

        System.out.println(
                "Previous day: " + prevDay + "/"
                        + prevMonth + "/" + prevYear);

        scanner.close();
    }
}
