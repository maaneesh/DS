package Swapping;

public class swap3NoTemp {
    public static void main(String[] args) {
        int fNum = 300;
        int sNum = 200;
        int tNum = 600;

        System.out.println("Before swap");
        System.out.println("fnum: " + fNum + "\t" + "snum: " + sNum + "\t" + "tnum: " + tNum);
        //swapping
        fNum = fNum + sNum + tNum;
        sNum = fNum - (sNum + tNum);
        tNum = fNum - (sNum + tNum);
        fNum = fNum - (sNum + tNum);


        System.out.println("After swap");
        System.out.println("fnum: " + fNum + "\t" + "snum: " + sNum + "\t" + "tnum: " + tNum);
    }
}
