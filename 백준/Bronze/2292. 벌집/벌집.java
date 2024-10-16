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

        int start = 1;
        int end = 1;
        int count = 1;

        if (N != 1) {
            while (true) {
                start = end +1 ;
                end = start + (6 * count) - 1;
                count++;

                if (N >= start && N <= end) {
                    break;
                }
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();

        br.close();
        bw.close();
    }


}
