package Arrays;

public class Arrays {
    public static void calculateAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        int avg = sum/array.length;
        System.out.println("The average is: "+avg);
    }
    public static void main(String[] args) {

    }
}
