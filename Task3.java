package JavaOOP.Ass2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values for array: ");
        int[] arr=new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i< arr.length;i++){
            if(arr[i]%2==0){
                arr[i]*=-1;
            }
        }
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}
