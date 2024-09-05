package Swapping;

public class swap3Num {
    public static void main(String[] args) {
        int fNum = 300;
        int sNum = 200;
        int tNum = 600;
        int temp = 0;
        System.out.println("Before swap");
        System.out.println("fnum: " + fNum + "\t" + "snum: " + sNum + "\t" + "tnum: " + tNum);
        //swapping
        temp = fNum;
        fNum = sNum;
        sNum = tNum;
        tNum = temp;

        System.out.println("After swap");
        System.out.println("fnum: " + fNum + "\t" + "snum: " + sNum + "\t" + "tnum: " + tNum);


    }
}
