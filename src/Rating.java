import java.util.Scanner;
public class Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[20];
        float[] b = new float[20];
        String[] c = new String[20];
        for(int i = 0; i < 20; i++) {
            a[i] = sc.next();
            b[i] = sc.nextFloat();
            c[i] = sc.next();
        }
        float sum = 0;
        float sum2 = 0;
        for(int i = 0; i < 20; i++) {
            if(c[i].equals("A+")) {
                sum += 4.5 * b[i];
            } else if(c[i].equals("A0")) {
                sum += 4.0 * b[i];
            } else if(c[i].equals("B+")) {
                sum += 3.5 * b[i];
            } else if(c[i].equals("B0")) {
                sum += 3.0 * b[i];
            } else if(c[i].equals("C+")) {
                sum += 2.5 * b[i];
            } else if(c[i].equals("C0")) {
                sum += 2.0 * b[i];
            } else if(c[i].equals("D+")) {
                sum += 1.5 * b[i];
            } else if(c[i].equals("D0")) {
                sum += 1.0 * b[i];
            } else if(c[i].equals("F")) {
                sum += 0.0 * b[i];
            }else if(c[i].equals("P")) {
                sum += 0.0 * b[i];
            }
        }
        for(int i = 0; i < 20; i++) {
            if(c[i].equals("P")) {
                sum2 += 0;
            }else {
                sum2 += b[i];
            }
        }
        System.out.printf("%f", sum/sum2);
    }
}
