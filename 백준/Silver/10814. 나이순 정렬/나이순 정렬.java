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
import java.util.Comparator;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());
        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            Person p = new Person(name, age, i); 
            peopleList.add(p);
        }

        peopleList.sort(Comparator.comparingInt(Person::getAge).thenComparingInt(Person::getOrder));

        for (Person person : peopleList) {
            bw.write(person.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

class Person {
    String name;
    int age;
    int order; 

    public Person(String name, int age, int order) {
        this.name = name;
        this.age = age;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getOrder() {
        return order;
    }

    public String toString() {
        return age + " " + name;
    }
}