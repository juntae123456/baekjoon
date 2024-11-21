import java.io.*;
public class inputoutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = "";
        int i = 0;
        while(i<100)
        {
            a = br.readLine();
            if(a==null)
            {
                break;
            }
            bw.write(a + "\n");
            bw.flush();
        }
    }
}
