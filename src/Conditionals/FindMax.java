package Conditionals;

public class FindMax {
    public static int findMax(int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b >= max) max = b;
        else if (c >= max) {
            max = c;

        }
        return max;
    }
}
