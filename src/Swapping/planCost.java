package Swapping;

import java.text.DecimalFormat;

public class planCost {
    public static void main(String[] args) {
        int basePrice = 699;
        float gst = 18f / 100;

        float totalPrice = basePrice * (1 + gst);
        DecimalFormat df = new DecimalFormat("#.00");
        String finalPrice = df.format(totalPrice);
        System.out.println("final cost : " + finalPrice);


    }
}
