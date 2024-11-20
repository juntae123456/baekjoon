import java.util.Scanner;

public class Numadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int sum = 0;

        for (int i = 0; i < a; i++) {
            char digit = b.charAt(i);
            sum += Character.getNumericValue(digit);
        }

        System.out.println(sum);
    }
}