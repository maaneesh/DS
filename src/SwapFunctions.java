public class SwapFunctions {
    public static void main(String[] args) {

        public static void swap2withTemp () {
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

        public static void swap2NoTemp () {

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


        public static void swap3NoTemp () {
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

        public static void swap3withTemp () {
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

        public static void swap4WithTemp () {
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
        public static void swap4NoTemp () {
            int fNum = 300;
            int sNum = 200;
            int tNum = 600;
            int jNum = 500;


            System.out.println("Before swap");
            System.out.println("num1: " + fNum + "\t" + "num2: " + sNum + "\t" + "num3: " + tNum + "\t" + "num4: " + jNum);
            //swapping
            fNum = fNum + sNum + tNum + jNum;
            sNum = fNum - (sNum + tNum + jNum);
            tNum = fNum - (sNum + tNum + jNum);
            jNum = fNum - (sNum + tNum + jNum);
            fNum = fNum - (sNum + tNum + jNum);


            System.out.println("After swap");
            System.out.println("num1: " + fNum + "\t" + "num2: " + sNum + "\t" + "num3: " + tNum + "\t" + "num4: " + jNum);
        }
    }
}
