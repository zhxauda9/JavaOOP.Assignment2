package JavaOOP.Ass2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int N = sc.nextInt();
        int[] array = new int[N];

        System.out.print("Enter the values for array: ");
        for(int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int maxElem = 0;

        for (int i = 0; i < array.length;i++){
            if (array[i] > maxElem){
                maxElem = array[i];
            }
        }
        System.out.print("Maximum number in the array: " + maxElem);
        sc.close();
    }
}
