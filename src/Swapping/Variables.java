package Swapping;

import java.text.DecimalFormat;

public class Variables {

    //7.

    public static void internetPlanCost(){
        int basePrice = 699;
        float gst = 18f / 100;

        float totalPrice = basePrice * (1 + gst);
        DecimalFormat df = new DecimalFormat("#.00");
        String finalPrice = df.format(totalPrice);
        System.out.println("final cost : " + finalPrice);

    }
    //8.

    public static void pizzaBill(){
        int quantity =2;
        float discount = 20/100f;
        float price = 399.0f;
        //format floating point digits
        DecimalFormat df = new DecimalFormat("#.00");
        float totalPrice = ((price*quantity)*(1-discount));
        String finalPrice = df.format(totalPrice);


        System.out.println("final Price : "+finalPrice);
    }
    //9.

    public static void incomeTax(){
        int salary = 85000;
        float incomeTax = 20 / 100f;
        float taxAmount = incomeTax * salary;

        System.out.println("Salary: " +salary);
        System.out.printf("Tax amount: "+taxAmount);
    }
    //10.

    public static void interestCalculator(){
        int principal = 500000;
        float interestRate = (float) (6.8 / 100f);
        int years = 5;
        float interest = 0;

        float interestAmount = 500000 * years * interestRate;

        System.out.println(interestAmount);

    }
    //11.
    public static void incomeCalculator(){
        int baseSalary = 85000;
        float ta = (15 / 100f);
        float da = (20 / 100f);
        float hra = (18 / 100f);
        float pf = (20 / 100f);
        float tax = (25 / 100f);
        float tAmount = baseSalary * ta;
        float dAmount = baseSalary * da;
        float hrAmount = baseSalary * hra;
        float pfAmount = baseSalary * pf;
        float taxAmount = baseSalary * tax;


        float grossAmount = baseSalary + tAmount + dAmount + hrAmount;
        float netAmount = grossAmount - (pfAmount + taxAmount);

        System.out.println("GrossAmount: " + grossAmount);
        System.out.println("Net Amount: " + netAmount);


    }


}
