public class NetIncome {
    public static void main(String[] args) {
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
