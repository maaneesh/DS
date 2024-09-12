import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Pick an option(1-20): ");
        int option = sc.nextInt();

        switch (option){
            case (1):
                minVal();
                break;
            case (2):

        }
    }

    public static void minVal() {
        int[] arr = {3, 4, -4, 23, 4, 2, 34, 5};
        int min = arr[0];

        for (int each : arr) {
            if (each <= min) {
                min = each;
            }
        }
        System.out.println("Min: " + min);
    }
}
