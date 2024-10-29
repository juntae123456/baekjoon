import java.util.Scanner;
import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int[] b = new int[a];
        for(int i=0;i<a;i++){
            b[i] = sc.nextInt();
        }
        float[] c = new float[a];
        int max = Arrays.stream(b).max().getAsInt();
        for(int i=0;i<a;i++){
            c[i]=(float)b[i]/max*100;
        }
        float sum =0;
        for(int i=0;i<a;i++){
            sum+=c[i];
        }
        sum=sum/a;
        System.out.println(sum);
    }
}
