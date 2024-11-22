import java.util.Scanner;
public class GroupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            boolean[] b = new boolean[26];
            boolean isGroupWord = true;

            for (int j = 0; j < a.length(); j++) {
                char c = a.charAt(j);
                if (b[c - 'a']) {
                    isGroupWord = false;
                    break;
                }
                if (j < a.length() - 1 && c != a.charAt(j + 1)) {
                    b[c - 'a'] = true;
                }
            }

            if (isGroupWord) {
                count++;
            }
        }

        System.out.println(count);
    }
}
