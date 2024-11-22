import java.util.Locale;
import java.util.Scanner;
public class wordstudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.toLowerCase();
        int[] b = new int[26];

        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
        }

        for (int i = 0; i < a.length(); i++) {
            int index = a.charAt(i) - 'a';
            b[index]++;
        }

        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] == max && i != maxIndex) {
                System.out.println("?");
                return;
            }
        }
        System.out.println((char)(maxIndex + 'A'));
    }
}
