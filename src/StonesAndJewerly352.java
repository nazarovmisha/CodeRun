//https://coderun.yandex.ru/problem/rocks-and-jewels?currentPage=1&groups=backend&pageSize=20&search=&sort=EASY_FIRST

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class StonesAndJewerly352 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String jew = reader.readLine().trim();
        String s = reader.readLine().trim();
        String[] jjew = jew.split("");
        Set<String> set = new HashSet<>();
        for (String i : jjew) {
            set.add(i);
        }
        String[] res = new String[set.size()];
        int k = 0;
        for (String i : set) {
            res[k++] = i;
        }

        String[] ss = s.split("");
        reader.close();
        int result = 0;
        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if (ss[i].equals(res[j])) {
                    result++;
                }
            }
        }

        String answer = String.valueOf(result);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        if (jew.equals("") || s.equals("")) {
            writer.write("0");
        } else {
            writer.write(answer);
            writer.close();
        }
    }
}
