package Swapping;

public class Swap4withTemp {
    public static void main(String[] args) {
        int fNum = 300;
        int sNum = 200;
        int tNum = 600;
        int jNum = 500;
        int temp = 0;

        System.out.println("Before swap");
        System.out.println("num1: " + fNum + "\t" + "num2: " + sNum + "\t" + "num3: " + tNum + "\t" + "num4: " + jNum);
        //swapping

        temp = fNum;
        fNum = sNum;
        sNum = tNum;
        tNum = jNum;
        jNum = temp;

        System.out.println("After swap");
        System.out.println("num1: " + fNum + "\t" + "num2: " + sNum + "\t" + "num3: " + tNum + "\t" + "num4: " + jNum);
    }
}
