package Swapping;

public class swap4NoTemp {
    public static void main(String[] args) {
        int fNum = 300;
        int sNum = 200;
        int tNum = 600;
        int jNum = 500;


        System.out.println("Before swap");
        System.out.println("num1: " + fNum + "\t" + "num2: " + sNum + "\t" + "num3: " + tNum + "\t" + "num4: " + jNum);
        //swapping
        fNum = fNum + sNum + tNum +jNum;
        sNum = fNum - (sNum+tNum+jNum);
        tNum = fNum - (sNum + tNum +jNum);
        jNum = fNum - (sNum + tNum +jNum);
        fNum = fNum - (sNum + tNum +jNum);




        System.out.println("After swap");
        System.out.println("num1: " + fNum + "\t" + "num2: " + sNum + "\t" + "num3: " + tNum + "\t" + "num4: " + jNum);
    }
}
