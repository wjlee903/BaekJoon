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
import java.util.Collections;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // int N = Integer.parseInt(br.readLine().trim());
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine().trim());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            if (num == 0) {
                result.remove(result.size() - 1);
                continue;
            }
            result.add(num);
        }

        int sum = 0;
        for (int i : result) {
            sum += i;
        }

        bw.write(String.valueOf(sum));

        bw.flush();

        br.close();
        bw.close();

    }

}

