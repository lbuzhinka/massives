import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] arr = new int[]{1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        String[] myArr = {"apple", "banana", "orange", "grape"};
        System.out.println("\nTask 2");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.print(doubleArr[i]);
            if (i < doubleArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]);
            if (i < myArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nTask 3");
        for (int i = 2; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubleArr.length -1 ; i >= 0; i--) {
            System.out.print(doubleArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = myArr.length -1 ; i >= 0; i--) {
            System.out.print(myArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\nTask 4");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr [i] ++;}
                System.out.println(Arrays.toString(arr));
        }
    }}



