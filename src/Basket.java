import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Basket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        HashMap<String, Integer> stMap = new HashMap<>();
        String[] st = new String[a];

        for (int i = 0; i < a; i++) {
            st[i] = br.readLine();
            stMap.put(st[i], i + 1);
        }

        String[] bt = new String[b];
        for (int i = 0; i < b; i++) {
            bt[i] = br.readLine();
        }

        for (int i = 0; i < bt.length; i++) {
            if (isNumeric(bt[i])) {
                int c = Integer.parseInt(bt[i]) - 1;
                bw.write(st[c] + "\n");
            } else {
                if (stMap.containsKey(bt[i])) {
                    bw.write(stMap.get(bt[i]) + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isNumeric(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}
