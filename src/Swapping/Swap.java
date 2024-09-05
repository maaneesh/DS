package Swapping;

public class Swap {
    public static void main(String[] args) {
        int fNum = 300;
        int sNum = 700;
        int temp = 0;

        System.out.println("Before swap");
        System.out.println("fnum: " + fNum + "\t" + "snum: " + sNum);
        //Swapping
        temp = fNum;
        fNum = sNum;
        sNum = temp;

        System.out.println("After swap");
        System.out.println("fnum: " + fNum + "\t" + "snum: " + sNum);

    }

}
