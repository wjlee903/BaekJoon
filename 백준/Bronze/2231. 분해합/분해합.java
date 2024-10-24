import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer stk = new StringTokenizer(br.readLine().trim());

        int N = Integer.parseInt(stk.nextToken());

        String strN = Integer.toString(N);

        int startN = N - (strN.length() * 9);

        for (int i = startN; i < N; i++) {
            int sum = i;
            int temp = i;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == N) {
                bw.write(Integer.toString(i));
                break;
            }

            if (i == N - 1) {
                bw.write("0");
            }

        }

        bw.flush();

        br.close();
        bw.close();
    }

}