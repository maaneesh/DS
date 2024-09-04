package Swapping;

import java.text.DecimalFormat;

public class finalBill {
    public static void main(String[] args) {
        int quantity =2;
        float discount = 20/100f;
        float price = 399.0f;
        //format floating point digits
        DecimalFormat df = new DecimalFormat("#.00");
        float totalPrice = ((price*quantity)*(1-discount));
        String finalPrice = df.format(totalPrice);


        System.out.println("final Price : "+finalPrice);
    }
}
