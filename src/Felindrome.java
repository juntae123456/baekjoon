import java.util.Scanner;

public class Felindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean isPalindrome = true;

        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.print(isPalindrome ? 1 : 0);
    }
}