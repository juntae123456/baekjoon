import java.util.Scanner;
public class LengthMeasurement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = 0;
        for(int i = 0; i < a.length(); i++) {
            b++;
        }
        System.out.println(b);
    }
}
