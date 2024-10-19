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


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer stk = new StringTokenizer(br.readLine().trim());

        int A = Integer.parseInt(stk.nextToken()); // 낮에 올라가는 거리
        int B = Integer.parseInt(stk.nextToken()); // 밤에 미끄러지는 거리
        int V = Integer.parseInt(stk.nextToken()); // 나무 막대 높이
        // System.out.println("A: " + A + " B: " + B + " V: " + V);

        int result = 0; // 최소 일수

        // while (V > 0) {
        //     V -= A;
        //     result++;
        //     if (V <= 0) {
        //         break;
        //     }
        //     V += B;
        // }

        result = (V - B - 1) / (A - B) + 1;

        bw.write(String.valueOf(result));

        bw.flush();

        br.close();
        bw.close();
    }

}