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
        
        int N = Integer.parseInt(br.readLine().trim());
        // StringTokenizer stk = new StringTokenizer(br.readLine().trim());


        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            // list.add(String.valueOf(stk.nextToken()));
            list.add(br.readLine().trim()); // N개의 괄호 문자열을 읽음
        }

        for (int i = 0; i < N; i++) {
            String str = list.get(i);
            result.add(solution(str));
        }

        bw.write(String.join("\n", result));

        bw.flush();

        br.close();
        bw.close();
    }

    public static String solution(String str) {
        if (str.length() < 2) { return "NO"; }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
            }

            if (count < 0) {
                return "NO";
            }

        }
        return count == 0 ? "YES" : "NO";
    }

}
