import java.util.Scanner;
public class Croatia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            count++;
            if (c == 'c' && i < a.length() - 1) {
                if (a.charAt(i + 1) == '=' || a.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (c == 'd' && i < a.length() - 1) {
                if (a.charAt(i + 1) == '-') {
                    i++;
                } else if (a.charAt(i + 1) == 'z' && i < a.length() - 2) {
                    if (a.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            } else if ((c == 'l' || c == 'n') && i < a.length() - 1) {
                if (a.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if ((c == 's' || c == 'z') && i < a.length() - 1) {
                if (a.charAt(i + 1) == '=') {
                    i++;
                }
            }
        }

        System.out.println(count);
    }
}
