package Swapping;

public class InterestCalculator {
    public static void main(String[] args) {
        int principal = 500000;
        float interestRate = (float) (6.8/100f);
        int years = 5;
        float interest = 0;

        float InterestAmount = 500000*years*interestRate;

        System.out.println(InterestAmount);



        for (int i = 1; i <=5 ; i++) {
            interest += principal* (interestRate);


        }
        System.out.println(interest);


    }
}
