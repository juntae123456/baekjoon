import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int sum = 0;
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        selection_sort(a);
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

    public static void selection_sort(int[] a) {
        selection_sort(a, a.length);
    }

    private static void selection_sort(int[] a, int size) {

        for (int i = 0; i < size - 1; i++) {
            int min_index = i;

            // 최솟값을 갖고있는 인덱스 찾기
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            // i번째 값과 찾은 최솟값을 서로 교환
            swap(a, min_index, i);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
