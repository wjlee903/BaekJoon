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
        Set<Integer> set = new HashSet<>();
        
        // 공백으로 구분된 숫자들을 한 줄로 입력받아 split을 통해 처리
        String[] inputNumbers1 = br.readLine().trim().split(" ");
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(inputNumbers1[i]));
        }
        
        int M = Integer.parseInt(br.readLine().trim());
        String[] inputNumbers2 = br.readLine().trim().split(" ");
        for (int i = 0; i < M; i++) {
            int value = Integer.parseInt(inputNumbers2[i]);
            if (set.contains(value)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }


        bw.flush();

        br.close();
        bw.close();


    }

    public static class DFS {
        public static String dfs(Map<Integer, Set<Integer>> graph, int start) {
            StringBuilder sb = new StringBuilder();
            boolean[] visited = new boolean[graph.size() + 1];
            dfs(graph, start, visited, sb);
            return sb.toString();
        }

        public static void dfs(Map<Integer, Set<Integer>> graph, int start, boolean[] visited, StringBuilder sb) {
            visited[start] = true;
            // System.out.println("visited: " + Arrays.toString(visited));

            sb.append(start).append(" ");

            // System.out.println("start : " + start + " , graph.get(start) : " + graph.get(start));
            for (int node : graph.get(start)) {
                if (!visited[node]) {
                    dfs(graph, node, visited, sb);
                }
            }
        }
    }

    public static class BFS {
        public static String bfs(Map<Integer, Set<Integer>> graph, int start) {
            StringBuilder sb = new StringBuilder();
            boolean[] visited = new boolean[graph.size() + 1];
            bfs(graph, start, visited, sb);
            return sb.toString();
        }

        public static void bfs(Map<Integer, Set<Integer>> graph, int start, boolean[] visited, StringBuilder sb) {
            List<Integer> queue = new ArrayList<>();
            queue.add(start);
            visited[start] = true;

            // System.out.println("1. queue : " + queue);
            // System.out.println("1. start : " + start + " , graph.get(start) : " + graph.get(start));

            while (!queue.isEmpty()) {
                // System.out.println("2. queue : " + queue);
                // System.out.println("2. start : " + start + " , graph.get(start) : " + graph.get(start));
                int node = queue.remove(0);
                sb.append(node).append(" ");

                for (int next : graph.get(node)) {
                    if (!visited[next]) {
                        queue.add(next);
                        visited[next] = true;
                    }
                }
            }
        }
    }

}
