package JavaOOP.Ass2;

import java.util.Scanner;

public class Task8 {
    public static int [][] multiArray;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows in the array: ");
        int N=sc.nextInt();
        System.out.print("Enter the numbers: ");
        int[] nums=new int[N];
        for(int i=0; i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        multiArray=new int[N][];
        for(int i=0;i<multiArray.length;i++) {
            multiArray[i] = new int[nums[i]];
        }
        System.out.println("The result:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < nums[i]; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
