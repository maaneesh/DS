package Swapping;

public class Swap2NoTemp {
    public static void main(String[] args) {
        int fNum = 400;
        int sNum = 500;
        System.out.println("Before swap");
        System.out.println("fnum: " + fNum + "\t" + "snum: " + sNum);

        //SWAPPING
        fNum = fNum + sNum;
        sNum = fNum - sNum;
        fNum = fNum - sNum;
        System.out.println("After swap");

        System.out.println("fnum: " + fNum + "\t" + "snum: " + sNum);

    }
}
