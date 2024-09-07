package Conditionals;

import java.util.Scanner;

public class FlowControl {
    private static final Scanner sc = new Scanner(System.in);

    //1. print max
    public static void printMax(int a, int b) {
        int max = 0;
        if (a >= b) max = a;
        else max = b;
        System.out.println("Max is: " + max);
    }

    //2. print max of 3
    public static void maxOfThree(int a, int b, int c) {
        int max = a;
        if (b >= max) max = b;
        else if (c >= max) {
            max = c;

        }
        System.out.println("Max is: " + max);
    }

    //3. check divisibility
    public static void divisibleByThree() {
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if (num % 3 == 0) System.out.println("Divisible by 3");
        else System.out.println("Not divisible by 3");

        sc.close();
    }
    //4.

    public static void divisibleByFive() {
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if (num % 5 == 0) System.out.println("Divisible by 5");
        else System.out.println("Not divisible by 5");

        sc.close();
    }
    //5.

    public static void divisibleByEleven() {
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if (num % 11 == 0) System.out.println("Divisible by 11");
        else System.out.println("Not divisible by 11");
        sc.close();
    }

    //6.

    public static void evenOrOdd(int num) {
        if (num % 2 == 0) System.out.println(num + " is an even number.");
        else System.out.println(num + " is an odd number.");
    }
    //7.

    public static void isLeapYear() {
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 == 0))
                System.out.println(year + " is a leap year");
            else if (year % 100 == 0) {
                System.out.println(year + " is not leap year");

            }
        }
        System.out.println(year + " is not leap year");
    }

    public static boolean LeapYear(int year) {


        if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 == 0))
                return true;
            else if (year % 100 == 0) {
                return false;
            }
        }
        return false;
    }
    //8.

    public static void isDigit() {
        System.out.println("Please enter a digit: ");
        char userIn = sc.next().charAt(0);
        if (userIn >= '0' && userIn <= '9') {
            System.out.println(userIn + " is a Number.");
        } else {
            System.out.println(userIn + " is not a Number.");

        }
    }
    //9.

    public static void isAlphabet() {
        System.out.println("Please enter a character: ");
        char userIn = sc.next().charAt(0);
        if ((userIn >= 'A' && userIn <= 'Z') || (userIn >= 'a' && userIn <= 'z')) {
            System.out.println(userIn + " is in Alphabet.");
        } else {
            System.out.println(userIn + " is not in Alphabet.");

        }
    }
    //10.

    public static void isDigitAlphabetOrSpecial() {
        System.out.println("Please enter a character: ");
        char userIn = sc.next().charAt(0);
        int asciiVal = (int) userIn;
        System.out.println(asciiVal);
        if ((asciiVal >= '0' && asciiVal <= '9')) {
            System.out.println(userIn + " is a number.");
        } else if ((asciiVal >= 'A' && asciiVal <= 'Z') || (asciiVal >= 'a' && asciiVal <= 'z')) {
            System.out.println(asciiVal + " is in Alphabet.");
        } else {
            System.out.println(asciiVal + " is a special character.");

        }
        sc.close();
    }
    //11.

    public static void isPositiveOrNegative() {
        System.out.println("Please enter a number: ");
        int userIn = sc.nextInt();
        if (userIn < 1) {
            System.out.println(userIn + " is negative.");
        } else System.out.println(userIn + " is positive.");
        sc.close();
    }
    //12.

    public static void convertToFahrenheit() {
        System.out.print("Enter temperature (in Celsius): ");
        float tempC = sc.nextFloat();

        double tempF = (tempC * 1.8) + 32;
        System.out.println(tempC + " is " + tempF + "F");

    }
    //13.

    public static void convertCelsius() {
        System.out.print("Enter temperature in Fahrenheit: ");

        double tempF = sc.nextFloat();
        double tempC = ((tempF - 32) * 5) / 9;
        System.out.println(tempF + " is " + tempC + " Celsius");

    }

    //14.
    public static void vowelOrConsonant() {
        System.out.print("Enter a character: ");
        char letter = sc.next().charAt(0);
        char inputLower = Character.toLowerCase(letter);
        if ((inputLower == 'a') || inputLower == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " is a vowel.");

        } else System.out.println(letter + " is a consonant.");
        sc.close();
    }

    //15.
    public static void upperOrLower() {
        System.out.print("Enter a character: ");
        char charIn = sc.next().charAt(0);

        if ((int) charIn >= 65 && (int) charIn <= 90) System.out.println("Uppercase");
        else if (((int) charIn >= 97 && (int) charIn <= 122)) {
            System.out.println("Lowercase");

        } else System.out.println("Not an alphabet");

    }
    //16.

    public static void dayOfTheWeek() {
        System.out.print("Enter number of the day: ");
        int dayNum = sc.nextInt();
        if (dayNum < 1 || dayNum > 7) System.out.println("Enter valid day");
        switch (dayNum) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

    }

    //17.
    public static void daysInAMonth() {
        System.out.println("Enter month: ");
        String month = sc.next();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        int length = month.length();
        String monthLower = month.toLowerCase();

        if ((monthLower.equals("january")) || (monthLower.equals("march")) || (monthLower.equals("may")) || (monthLower.equals("july")) || (monthLower.equals("august")) || (monthLower.equals("october")) || (monthLower.equals("december"))) {
            System.out.println(month + " has 31 days.");
        } else if ((monthLower.equals("april")) || (monthLower.equals("june")) || (monthLower.equals("september")) || (monthLower.equals("november"))) {
            System.out.println(month + " has 30 days.");
        } else if (monthLower.equals("february")) {
            if (LeapYear(year)) System.out.println(month + " has 29 days.");
            else System.out.println(month + " has 28 days.");
        }

    }
    //18.

    public static void triangleType() {
        System.out.print("Enter lengths of each side: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
            System.out.println("Isosceles triangle");

        } else System.out.println("Scalene triangle");

    }


    //19
    public static void eligibleToVote() {
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Congrats you're eligible to vote");
        } else System.out.println("You aren't eligible.");
        sc.close();
    }

    //20
    public static void checkDivision(float grade) {

        if (grade >= 60) System.out.println("Grade: 1st Division");
        else if (grade >= 45) {
            System.out.println("Grade: 2nd Division");

        } else if (grade >= 30) {
            System.out.println("Grade: 3rd Division");

        } else System.out.println("Grade: F");

    }
    //21.

    public static void gradeCalculator() {

        System.out.print("Enter your math grade: ");
        float mathGrade = sc.nextFloat();
        System.out.print("Enter your science grade: ");
        float physicsGrade = sc.nextFloat();

        System.out.print("Enter your Chemistry grade: ");
        float chemistryGrade = sc.nextFloat();
        System.out.print("Enter your English grade: ");
        float englishGrade = sc.nextFloat();
        System.out.print("Enter your Nepali grade: ");
        float nepaliGrade = sc.nextFloat();


        float termAverage = ((mathGrade + physicsGrade + chemistryGrade + englishGrade + nepaliGrade) / 5);

        String reportCard = "*".repeat(15);
        reportCard += "\t\tYOUR REPORT CARD \t\t";
        reportCard += "*".repeat(15);
        System.out.println(reportCard);
        System.out.println("\tMath: " + mathGrade + "\n\tPhysics: " + physicsGrade + "\n\tChemistry: " + chemistryGrade + "\n\tEnglish: " + englishGrade + "\n\tNepali: " + nepaliGrade);
        System.out.println("Your term average was: " + termAverage);
        checkDivision(termAverage);
        sc.close();
    }


}
