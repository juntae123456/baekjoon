import java.util.Scanner;
public class MatrixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] > max) {
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.printf("%d\n%d %d", max, x + 1, y + 1);
    }
}
