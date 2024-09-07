package Conditionals;

import java.util.Scanner;

public class Numbers {
    private static final Scanner sc = new Scanner(System.in);

    public static void printNaturalNumbers() {
        System.out.println("1.Print Natural Numbers\n");
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num < 1) System.out.println("Natural numbers are positive numbers only.");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "\t");
        }
        sc.close();

    }

    public static void printToHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");

        }
    }













}
