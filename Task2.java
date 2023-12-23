package JavaOOP.Ass2;
public class Task2 {
    public static void main(String[] args) {
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            if (i % 2 != 0) {
                str[i] = "Odd";
            } else {
                str[i] = "Even";
            }
        }
        for (int i = 0; i < str.length; i++){
            System.out.println("Index " +i+" is: "+str[i]);
        }
    }
}
