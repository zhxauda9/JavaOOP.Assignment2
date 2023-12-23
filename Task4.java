package JavaOOP.Ass2;
import java.util.Scanner;
public class Task4 {
    public static int[] firstArr = new int[10];
    public static int[] secondArr = new int[10];
    public static int[] resArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for array1:");
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = sc.nextInt();
        }
        System.out.print("Enter the values for array2:");
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = sc.nextInt();
        }
        int reslen = firstArr.length + secondArr.length;
        resArr = new int[reslen];
        System.arraycopy(firstArr, 0, resArr, 0, firstArr.length);
        System.arraycopy(secondArr, 0, resArr, firstArr.length, secondArr.length);
        System.out.println("Result Array:");
        for (int element : resArr) {
            System.out.print(element + " ");
        }
    }
}
