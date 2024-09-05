package Conditionals;

import java.util.Scanner;

public class Divisibility {
    private static Scanner sc = new Scanner(System.in);
    public static boolean divisibleByThree(int num) {
        if (num % 3 == 0) return true;
        return false;
    }

    public static boolean divisibleByFive(int num) {
        if (num % 5 == 0) return true;
        return false;
    }

    public static boolean divisibleByEleven(int num) {
        if (num % 11 == 0) return true;
        return false;
    }

    public static String evenOrOdd(int num) {
        if (num % 2 == 0) return "Even";
        else return "Odd";
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 == 0))
                return true;
            else if (year % 100 == 0) {
                return false;

            }
        }
        return false;
    }
    public static void isDigit(){
        System.out.println("Please enter a digit: ");
        char userIn = sc.next().charAt(0);
        if (userIn >='0' && userIn <= '9'){
            System.out.println(userIn+ " is a Number.");
        }else {
            System.out.println(userIn+ " is not a Number.");

        }
    }
    public static void isAlphabet(){
        System.out.println("Please enter a character: ");
        char userIn = sc.next().charAt(0);
        if ((userIn >='A' && userIn <= 'Z') || (userIn >='a' && userIn <= 'z')){
            System.out.println(userIn+ " is in Alphabet.");
        }else {
            System.out.println(userIn+ " is not in Alphabet.");

        }
    }
    public static void isDigitAlphabetOrSpecial(){
        System.out.println("Please enter a character: ");
        char userIn = sc.next().charAt(0);
        int asciiVal = (int)userIn;
        System.out.println(asciiVal);
        if ((userIn >='!' && userIn <= '/') ){
            System.out.println(userIn+ " is a Special character.");
        }
        else if ((userIn >='0' && userIn <= '9') ){
            System.out.println(userIn+ " is a number.");
        }
        else if ((userIn >='A' && userIn <= 'Z') || (userIn >='a' && userIn <= 'z')){
            System.out.println(userIn+ " is in Alphabet.");
        }
        else {
            System.out.println(userIn+ " is not in Alphabet, Number or Special Character.");

        }
    }

    public static void isPositiveOrNegative(){
        System.out.println("Please enter a number: ");
        int userIn = sc.nextInt();
        if (userIn<1){
            System.out.println(userIn+" is negative.");
        }
        System.out.println(userIn+" is positive.");
    }

    public static double convertTemp(float tempC){
        double tempF = 0;
        tempF = (tempC*1.8) +32;
        return tempF;

    }
    public static double convertCelsius(float tempF){
        double tempC = 0;
        tempC = ((tempF-32)*5)/9;
        return tempC;

    }



}
