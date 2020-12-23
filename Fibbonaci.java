import java.util.Arrays;
import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] arr = new int[amount] ;
        int first = 1;
        int second = 1;
        arr[0] = 1;
        arr[1] = 1;
        System.out.println(arr[0]+"\n"+arr[1]);
        for (int i = 0; i < arr.length-2; i++) {
            int third = first + second;
            first = second;
            second = third;
            arr[i] = third;
            System.out.println(arr[i]);
        }
    }
}
