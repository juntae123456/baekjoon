import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int sum = 0;
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int j : a) {
            sum += j;
        }
        sum %= 100;
        int x;
        int p = 0;
        int flag = 0;
        for (x = 0; x < a.length; x++) {
            for (p = x + 1; p < a.length; p++) {
                b = a[x] + a[p];
                if (b == sum) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        if (flag == 1) {
            for (int j : a) {
                if ((a[x] == j) || (a[p] == j)) {
                    continue;
                }
                System.out.printf("%d\n", j);
            }
        }
    }
}
