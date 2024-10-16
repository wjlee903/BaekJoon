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

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine().trim());
        }

        List<Integer> stack = new ArrayList<>();
        
        for (String s : list) {
            if (s.startsWith("push")) {
                String[] arr = s.split(" ");
                stack.add(Integer.parseInt(arr[1]));
            } else if (s.startsWith("pop")) {
                if (stack.size() == 0) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.get(stack.size() - 1) + "\n");
                    stack.remove(stack.size() - 1);
                }
            } else if (s.startsWith("size")) {
                bw.write(stack.size() + "\n");
            } else if (s.startsWith("empty")) {
                if (stack.size() == 0) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (s.startsWith("top")) {
                if (stack.size() == 0) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.get(stack.size() - 1) + "\n");
                }
            } 
        }

        bw.flush();

        br.close();
        bw.close();
    }


}
