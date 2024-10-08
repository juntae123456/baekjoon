import java.io.*;
import java.util.stream.IntStream;

public class Parking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int[][] x = new int[3][2];

        for (int i = 0; i < 3; i++) {
            String[] times = br.readLine().split(" ");
            x[i][0] = Integer.parseInt(times[0]);
            x[i][1] = Integer.parseInt(times[1]);

        }
        int sum=0;
        int[] count = new int[101];

        for(int i=0;i<3;i++){
            for(int j=x[i][0];j<x[i][1];j++){
                count[j]++;
            }
        }
        for (int i=1;i< 100;i++){
            if (count[i]==1){
                sum=sum+a;
            } else if (count[i]==2) {
                sum=sum+b*2;
            } else if (count[i]==3) {
                sum=sum+c*3;
            }
        }
        System.out.printf("%d",sum);
    }
}