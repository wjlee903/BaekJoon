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

        List<Point> points = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x, y));
        }

        Collections.sort(points, (a, b) -> {
            if (a.x == b.x) {
                return a.y - b.y;
            }
            return a.x - b.x;
        });

        // System.out.println("points: " + points);

        for (Point point : points) {
            bw.write(point.x + " " + point.y + "\n");
        }

        bw.flush();

        br.close();
        bw.close();

    }

    static class Point {
        int x;
        int y;
    
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}

