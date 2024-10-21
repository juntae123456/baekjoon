import java.util.Scanner;

public class BackBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 배열의 크기
        int b = sc.nextInt();  // 작업의 횟수
        int[] c = new int[a];  // 배열 선언

        for (int i = 0; i < a; i++) {
            c[i] = i + 1;
        }

        for (int i = 0; i < b; i++) {
            int d = sc.nextInt() - 1;  // 시작 인덱스 (1-based -> 0-based 변환)
            int e = sc.nextInt() - 1;  // 끝 인덱스 (1-based -> 0-based 변환)

            while (d < e) {
                int temp = c[d];
                c[d] = c[e];
                c[e] = temp;
                d++;
                e--;
            }
        }


        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
