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
        
        int N = Integer.parseInt(br.readLine().trim());
        // StringTokenizer stk = new StringTokenizer(br.readLine().trim());

        Set<String>     set     = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine().trim());
        }

        List<String> sortedList = new ArrayList<>(set);
        //System.out.println("sortedList: " + sortedList);

        sortedList.sort((a, b) -> {
            //System.out.println("a: " + a + ", b: " + b);
            if (a.length() != b.length()) {
                return a.length() - b.length();  
            }
            return a.compareTo(b);  
        });

        for (String s : sortedList) {
            bw.write(s + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }

}