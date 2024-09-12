package Conditionals;

import java.util.Scanner;

public class Numbers {
    private static final Scanner sc = new Scanner(System.in);

    //1.
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

    //2.
    public static void printToHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");

        }
    }

    //3.
    public static void printOddNum() {
        System.out.print("3.Print odd numbers \n Odd numbers: ");
        for (int i = 1; i < 100; i++) {
            if ((i % 2 != 0)) System.out.print(i + " ");

        }
    }

    //4.
    public static void evenSum() {
        System.out.print("4. Sum of even numbers \n Enter a number: ");
        int target = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= target; i++) {
            if (i % 2 == 0) sum += i;

        }
        System.out.println("Sum: " + sum);
    }

    //5.
    public static void oddSum() {
        System.out.print("5. Enter a number: ");
        int target = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= target; i++) {
            if (i % 2 != 0) sum += i;

        }
        System.out.println("Sum: " + sum);
        sc.close();
    }

    //6.
    public static void multiplicationTable() {
        System.out.print("6. Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);

        }
        sc.close();
    }

    //7.
    public static void countDigits() {
        System.out.println("7. Count number of digits in a number.");
        System.out.print("Enter a number: ");
        String userNum = sc.next();
        int length = 0;

        for (int i = 0; i < userNum.length(); i++) {
            if (Character.isDigit(userNum.charAt(i))) {
                length += 1;
            }
        }
        System.out.print("Length : " + length);
        sc.close();

    }

    //8.
    public static void sumOfDigits() {
        System.out.println("8. Sum of the digits of a number");
        System.out.print("Enter a number: ");
        String numIn = sc.next();
        int length = numIn.length() - 1;
        int intIn = Integer.parseInt(numIn);
        int sum = 0;
        while (intIn > 0) {
            sum += intIn % 10;
            intIn = intIn / 10;

        }
        System.out.println("Sum of digits in " + numIn + " is " + sum);
        sc.close();
    }

    //9 print natural numbers in reverse
    public static void reverseNatural() {
        System.out.println("9. Print Natural numbers in reverse.");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.print(i + " ");

        }
    }

    //10 check prime
    public static void isPrime() {
        System.out.println("10. Check if a number is prime: ");
        System.out.println("Enter a number: ");
        int numIn = sc.nextInt();

        if (numIn <= 1) {
            System.out.println(numIn + " is not Prime");
            return;
        }
        boolean isPrime = true;

        for (int i = 2; i < numIn / 2; i++) {
            if (numIn % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(numIn + " is Prime.");
        } else System.out.println(numIn + " is not Prime");

    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;


        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;

    }

    public static void listOfPrime() {
        System.out.println("11. Prints a series of prime numbers.");
        System.out.print("Enter a number: ");
        int numIn = sc.nextInt();
        for (int i = 0; i < numIn; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void sumOfPrime() {
        System.out.println("12. Print the sum of prime numbers.");
        System.out.print("Enter a number: ");
        int numIn = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= numIn; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of Prime numbers: " + sum);
    }

    public static boolean printArmstrong() {
        System.out.println("13.  Check if a number is Armstrong.");
        System.out.print("Enter a number: ");
        int numIn = sc.nextInt();
        int num = numIn;
        int length = 0;
        int digit;
        int armstrongSum = 0;
        while (num > 0) {
            length += 1;
            num /= 10;
        }
        num = numIn;
        while (num > 0) {
            digit = num % 10;
            armstrongSum += (int) Math.pow(digit, length);
            num /= 10;
        }
        if (armstrongSum == numIn) {
            System.out.println(numIn + " is Armstrong");
            return true;
        } else {
            System.out.println(numIn + " is not Armstrong");
            return false;
        }

    }
    public static boolean isArmstrong(int numIn) {

        if (numIn < 0 ){
            return false;
        }
        int num = numIn;
        int length = 0;
        int armstrongSum =0;

        while (num > 0) {
            length += 1;
            num /= 10;
        }
        num = numIn;
        while (num > 0) {
           int  digit = num % 10;
            armstrongSum += (int) Math.pow(digit, length);
            num /= 10;
        }
      return armstrongSum == numIn;
    }

    public static void listArmstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("14. Print a list of Armstrong numbers.");
        System.out.print("Enter a number: ");
        int numIn = sc.nextInt();
        System.out.print("Armstrong numbers up to " + numIn + ": ");

        for (int i = 1; i <= numIn; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
