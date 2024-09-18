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

        if (numIn < 0) {
            return false;
        }
        int num = numIn;
        int length = 0;
        int armstrongSum = 0;

        while (num > 0) {
            length += 1;
            num /= 10;
        }
        num = numIn;
        while (num > 0) {
            int digit = num % 10;
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
        sc.close();
    }

    //Checks if a number iw perfect
    public static boolean isPerfect(int numIn) {


        boolean isPerfect = false;

        int sum = 0;
        for (int i = 1; i < numIn; i++) {
            if (numIn % i == 0) {
                sum += i;
            }
        }
        if (sum == numIn) {
            isPerfect = true;
        }
        return isPerfect;
    }

    public static void perfectList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("16. Print a list of perfect numbers.");
        System.out.print("Enter a target number: ");
        int numIn = sc.nextInt();
        System.out.print("Perfect numbers: ");
        for (int i = 1; i < numIn; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int factorial(int numIn) {
        if (numIn == 0 || numIn == 1) return 1;
        return numIn * factorial(numIn - 1);
    }

    public static boolean strongNumber(int numIn) {
        //17/ strong number
        int originalNum = numIn;
        int perfectSum = 0;
        while (numIn > 0) {
            int digit = numIn % 10;
            perfectSum += factorial(digit);
            numIn /= 10;
        }
        if (perfectSum == originalNum) {
            return true;
        }
        return false;

    }

    public static void strongList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("18. Print a list of strong numbers.");
        System.out.print("Enter a number: ");
        int numIn = sc.nextInt();
        System.out.print("Strong numbers up to " + numIn + ": ");
        for (int i = 1; i < numIn; i++) {
            if (strongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void swapFirstAndLast(
    ) {
        System.out.println("19. Swap first and last digits.");
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int numIn = sc.nextInt();
        if (numIn > 1 && numIn < 10) {
            System.out.println(numIn);
            return;
        }
        int lastDigit = numIn % 10;

        int firstDigit = numIn;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int middlePart = numIn % (int) Math.pow(10, (int) Math.log10(numIn)); // Remove the first digit
        middlePart /= 10; // Remove the last digit

        int numOfDigits = (int) Math.log10(numIn);

        int swappedNumber = lastDigit * (int) Math.pow(10, numOfDigits) + middlePart * 10 + firstDigit;

        System.out.println("Number after swapping first and last digits: " + swappedNumber);
    }

    public static void swapNums(int fNum, int lNum) {
        System.out.println("20. Swap using temp variable");
        System.out.println("Before");
        System.out.println("firstNum: " + fNum + " lastNum: " + lNum);

        int temp = fNum;
        fNum = lNum;
        lNum = temp;

        System.out.println("After");
        System.out.println("firstNum: " + fNum + " lastNum: " + lNum);
    }

    public static void swapNumsII(int fNum, int lNum) {
        System.out.println("21. Swap without using temp variable");
        System.out.println("Before");
        System.out.println("firstNum: " + fNum + " lastNum: " + lNum);


        fNum = fNum + lNum;
        lNum = fNum - lNum;
        fNum = fNum - lNum;
        System.out.println("After");
        System.out.println("firstNum: " + fNum + " lastNum: " + lNum);
    }

    public static void powerFunc() {
        System.out.println("22. function calculates power ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int base = sc.nextInt();
        System.out.print("Power of " + base + ": ");
        int exponent = sc.nextInt();
        int result = calculatePower(base, exponent);
        System.out.println("Result: " + result);
    }

    public static void powerFuncII() {
        System.out.println("23. function calculates power ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int base = sc.nextInt();
        System.out.print("Power of " + base + ": ");
        int exponent = sc.nextInt();
        int result = 1;
        if (exponent == 1) result = base;
        for (int i = 1; i <= exponent; i++) {
            result *= base;

        }
        System.out.println("Result: " + result);
    }

    public static void powerFuncIII() {
        System.out.println("24. function calculates power using pow method ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = sc.nextInt();
        System.out.println("Power of " + base + ": ");
        int exponent = sc.nextInt();
        int result = (int) Math.pow(base, exponent);
        System.out.println("Result: " + result);

    }

    public static void checkPalindrome() {
        System.out.println("25. Check if a number is palindrome.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int numIn = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if (numIn == reversed) {
            System.out.println(numIn + " is a palindrome.");
        } else {
            System.out.println(numIn + " is not a palindrome.");
        }

    }

    public static void fibonacciFunction() {
        System.out.println("26. Fibonacci number calculations ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.println("Fibonacci number calculations ");
        for (int i = 0; i <= number; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;

        }

    }

    public static void fibonacciFunctionII() {
        System.out.println("27. Fibonacci number calculations using recursion ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int fibNum = recursiveFib(number);
        System.out.println(fibNum);


    }

    public static int recursiveFib(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (num == 0) return 0;
        else if (num == 1) return 1;
        return recursiveFib(num - 1) + recursiveFib(num - 2);

    }

    public static void frequencyOfDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] frequency = new int[10];

        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " " + frequency[i]);
            }

        }

    }

    public static void asciiValues
            () {
        System.out.println("29. ASCII Characters and their values:");

        for (int i = 0; i <= 127; i++) {
            char asciiChar = (char) i;
            System.out.println("ASCII value " + i + " = " + asciiChar);
        }
    }
    public static void alphabet(){
        System.out.println("30. Print a-z");
        for (char ch = 'a'; ch <= 'z' ; ch++) {
            System.out.print(ch+" ");

        }
        System.out.println();
    }
    public static void alphabetCapitalized(){
        System.out.println("31. Print A-Z");
        for (char ch = 'A'; ch <= 'Z' ; ch++) {
            System.out.print(ch +" ");
        }
        System.out.println();
    }
    public static void factors(){
        System.out.println("33. Factors of a given number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

         for (int i = 1; i <= number; i++) {
             if (number % i == 0) {
                 System.out.print(i+" ");
             }
         }
    }
    public static void HCF(){
        System.out.println("34. HCF of a given numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int hcf =1;
        for (int i = 1; i < Math.min(num1,num2) ; i++) {

            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
            
        }
        System.out.println("HCF of "+num1+" and "+num2+" is "+hcf);
        
    }

    public static void findLCM (){
        System.out.println("35. LCM of two numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
         int hcf = 1;
         for (int i = 1; i < Math.min(num1,num2) ; i++) {
             if (num1 % i == 0 && num2 % i == 0) {
                 hcf = i;
             }
         }
         int lcm = (num1*num2)/hcf;
        System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);

    }

    public static void primeFactors(){
        System.out.println("36. Prime Factors of a given number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            while (num % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
                num /= i;  // Divide the number by the factor
            }
        }
    }

    public static int calculatePower(int numIn, int power) {

        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return numIn;

        } else {
            return numIn * calculatePower(numIn, power - 1);

        }
    }


}
