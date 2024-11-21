import java.util.Scanner;
public class Numberkeywords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.trim();
        if (a.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = a.split("\\s+");
            System.out.println(words.length);
        }
    }
}
