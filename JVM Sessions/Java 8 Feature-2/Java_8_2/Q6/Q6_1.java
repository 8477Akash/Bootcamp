package Java_8_2.Q6;

import java.time.LocalDate;
import java.util.Scanner;


class MyDate {
    private int year;
    private int month;
    private int day;


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }


    public LocalDate toLocalDate() {
        return LocalDate.of(year, month, day);
    }


    @Override
    public String toString() {
        return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
    }
}


public class Q6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Date:");
        System.out.print("Year: ");
        int year1 = sc.nextInt();
        System.out.print("Month: ");
        int month1 = sc.nextInt();
        System.out.print("Day: ");
        int day1 = sc.nextInt();

        MyDate firstDate = new MyDate(year1, month1, day1);
        System.out.println("Enter Second Date:");
        System.out.print("Year: ");
        int year2 = sc.nextInt();
        System.out.print("Month: ");
        int month2 = sc.nextInt();
        System.out.print("Day: ");
        int day2 = sc.nextInt();

        MyDate secondDate = new MyDate(year2, month2, day2);
        LocalDate d1 = firstDate.toLocalDate();
        LocalDate d2 = secondDate.toLocalDate();

        if (d1.isBefore(d2)) {
            System.out.println("First date is before second date.");
        } else if (d1.isAfter(d2)) {
            System.out.println("First date is after second date.");
        } else {
            System.out.println("Both dates are equal.");
        }
    }
}
