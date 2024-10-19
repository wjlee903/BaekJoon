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

        int[] kilogram = new int[]{3, 5};

        int result = -1; 

       if ( N < 3) {
            result = -1;
       } else if ( N < 5) {
            if ( N % 3 == 0) {
                result = N / 3;
            } 
       } else {
            if ( N % 5 == 0) {
                result = N / 5;
            } else {
                if (N % 3 == 0) {
                    result = N / 3;
                    int count = N / 5;
                    for (int i = count; i > 0; i--) {
                        int temp = N - (5 * i);
                        if (temp % 3 == 0) {
                            result = i + (temp / 3);
                            break;
                        }
                    }
                } else {
                    int count = N / 5;
                    for (int i = count; i > 0; i--) {
                        int temp = N - (5 * i);
                        if (temp % 3 == 0) {
                            result = i + (temp / 3);
                            break;
                        }
                    }
                }
            }
        }
        bw.write(String.valueOf(result));

        bw.flush();

        br.close();
        bw.close();
    }

}
