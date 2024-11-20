import java.util.Scanner;

public class Alphabat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int[] b = new int[26];

        for (int i = 0; i < b.length; i++) {
            b[i] = -1;
        }

        // 입력된 문자열의 각 알파벳 위치 기록
        for (int i = 0; i < a.length(); i++) {
            int index = a.charAt(i) - 'a';
            if (b[index] == -1) {
                b[index] = i;
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}