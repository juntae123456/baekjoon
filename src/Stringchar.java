import java.util.Scanner;

public class Stringchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        System.out.println(a.charAt(b-1));
    }
}

