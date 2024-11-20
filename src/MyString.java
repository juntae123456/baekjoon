import java.util.Scanner;
public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i < a; i++) {
            String b = sc.next();
            for(int j = 0; j < b.length(); j++) {
                if(b.charAt(j)=='0'){
                    System.out.println("00");
                    break;
                }
                if(j==0){
                    System.out.printf("%c",b.charAt(j));
                }
                if(j+1==b.length()){
                    System.out.printf("%c\n",b.charAt(j));
                }
            }
        }
    }
}
