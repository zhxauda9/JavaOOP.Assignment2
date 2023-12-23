package JavaOOP.Ass2;

public class Task6 {
    public static void main(String[] args) {
        int[][] MULTIPLICATION_TABLE =new int[10][10];
        for(int i=1; i<MULTIPLICATION_TABLE .length;i++) {
            for (int j = 1; j < MULTIPLICATION_TABLE[0].length; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}