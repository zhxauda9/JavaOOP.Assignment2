package JavaOOP.Ass2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];

        System.out.print("Enter the values for int array: ");
        for (int i = 0; i < intArray.length; i++) {
            if (sc.hasNextInt()) {
                intArray[i] = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
                i--;
            }
        }

        System.out.print("Enter the values for double array: ");
        for (int i = 0; i < doubleArray.length; i++) {
            if (sc.hasNextDouble()) {
                doubleArray[i] = sc.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a double.");
                sc.next();
                i--;
            }
        }

        System.out.println("Int array elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Int array's " + i + " element: " + intArray[i]);
        }

        System.out.println();

        System.out.println("Double array elements:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Double array's " + i + " element: " + doubleArray[i]);
        }

        sc.close();
    }
}